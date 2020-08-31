import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i=0; i<size; i++) {
            list[i] = (int) Math.random()*100;
        }
        System.out.println("Original list --> " + Arrays.toString(list));
    }

    public static int[] selectSort(int[] array) {
        
        return array;
    }
}
