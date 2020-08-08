import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] arr = new int[10];
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter arr[" + i + "]");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        boolean isExist;
        int position = 0;
        System.out.println("Which number need to remove?");
        int number = sc.nextInt();
        int repeat = 0;
        do {
            isExist = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] == number) {
                    isExist = true;
                    position = i;
                    repeat += 1;
                    break;
                }
            }
            if (isExist) {
                for (i = position; i < arr.length - repeat; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - repeat] = 0;
            }

        }
        while (isExist);
        System.out.println(Arrays.toString(arr));
    }
}
