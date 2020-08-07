import java.util.Arrays;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0; i<array.length; i++) {
            array[i] = (int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min value of array: " + minValue(array));
    }

    public static int minValue(int [] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
