import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInTwoDimensionsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First dimension of array: ");
        int row = scanner.nextInt();
        System.out.println("Second dimension of array: ");
        int col = scanner.nextInt();
        double[][] array = new double[row][col];
        int i,j;
        double max;
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                System.out.println("Enter number");
                array[i][j] = scanner.nextDouble();
            }
            System.out.println(Arrays.toString(array[i]));
        }
        max = array[0][0];
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value in array: " + max);
    }
}
