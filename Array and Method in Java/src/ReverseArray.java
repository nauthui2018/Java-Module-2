import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        byte i = 0;
        byte j = 0;
        int[] array = new int[5];
        for (i=0; i< array.length; i++) {
            array[i] = (int) (Math.random() *30);
        }
        System.out.print("Array before reverse: ");
        System.out.println(Arrays.toString(array));
        for (i=0; i< array.length/2; i++) {
            array[i] = array[i] - array[array.length-1-i];
            array[array.length-i-1] = array[i] + array[array.length-i-1];
            array[i] = array[array.length-i-1] - array[i];
        }
        System.out.print("Array after reverse: ");
        System.out.println(Arrays.toString(array));
    }
}