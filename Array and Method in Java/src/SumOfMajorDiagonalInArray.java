import java.util.Arrays;
import java.util.Scanner;

public class SumOfMajorDiagonalInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int i,j;
        int sum = 0;
        for (i=0; i<size; i++) {
            for (j=0; j<size; j++) {
                array[i][j] = (int) (Math.random()*20 +1);
                if (i==j) {
                    sum += array[i][j];
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Sum of major diagonal: " + sum);
    }
}
