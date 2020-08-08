import java.util.Arrays;
import java.util.Scanner;

public class InsertElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] array = new int[10];
        for (i=0; i< array.length; i++) {
            System.out.println("Enter number");
            array[i] = scanner.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        boolean canInsert;
        int number;
        int index;
        do {
            canInsert = false;
            if (array[array.length-1] == 0) {
                canInsert = true;
            }
            System.out.println("Enter number");
            number = scanner.nextInt();
            System.out.println("Enter index");
            index = scanner.nextInt();
            if (canInsert) {
                for (i= array.length-1; i>index; i--) {
                    array[i] = array[i-1];
                }
                array[index] = number;
            }
        }
        while (canInsert);
        System.out.println("Can't insert " + number + "at index " + index);
    }
}
