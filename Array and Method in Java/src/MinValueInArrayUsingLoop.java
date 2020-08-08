import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArrayUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = scanner.nextInt();
        System.out.println("Enter the col");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        int i,j;
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                array[i][j] = (int) (Math.random()*20 +1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int min = array[0][0];
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min value is " + min);
    }
}
