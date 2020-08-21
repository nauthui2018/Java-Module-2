import java.util.Arrays;
import java.util.Scanner;

public class BobbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random()*100);
        }
        System.out.println("Array before sorting: " + Arrays.toString(list));
        int[] sortedList = bubbleSort(list);
        System.out.print("Array after sorting: " + Arrays.toString(sortedList));

    }

    public static int[] bubbleSort(int[] array) {
        int size = array.length;
        for (int i=1; i<size; i++) {
            boolean needNextPass = false;
            for (int j=0; j<size-1; j++) {
                if (array[j] > array[j+1]) {
                    array[j] = array[j] - array[j+1];
                    array[j+1] = array[j+1] + array[j];
                    array[j] = array[j+1] - array[j];
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                break;
            }
        }
        return array;
    }
}
