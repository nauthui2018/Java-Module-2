import java.util.Arrays;
import java.util.Scanner;

public class SumOfAColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row:");
        int row = scanner.nextInt();
        System.out.println("Enter the col:");
        int col = scanner.nextInt();
        double[][] array = new double[row][col];
        int i,j;
        //create new array
        for (i=0; i<row; i++) {
            for (j=0; j<col; j++) {
                array[i][j] = (int) (Math.random()*20 +1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int columnNumber;
        int sum;
        do {
            sum = 0;
            System.out.println("Which col need to calculate the sum? It's from 1 to " + col + "Enter 0 to exit");
            columnNumber = scanner.nextInt();
            while (columnNumber<0 || columnNumber>col) {
                System.out.println("Your column is invalid. It's from 1 to " + col + ". Enter 0 to exit");
                columnNumber = scanner.nextInt();
            }
            if (columnNumber == 0) {
                break;
            }
            for (i=0; i<row; i++) {
                for (j=0; j<col; j++) {
                    if (j == columnNumber-1) {
                        sum += array[i][j];
                    }
                }
            }
            System.out.println("Sum of column " + columnNumber + ": " + sum);
        }
        while (columnNumber != 0);
        System.out.println("Exited");
    }
}
