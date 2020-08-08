import java.lang.reflect.Array;
import java.util.Arrays;

public class Combine2Array {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int i;
        //I assume 2 arrays have the same length.
        for (i=0; i< array1.length; i++) {
            array1[i] = (int) (Math.random()*10);
            array2[i] = (int) (Math.random()*10);
        }
        int[] array = new int[array1.length+ array2.length];
        for (i=0; i< array1.length; i++) {
            array[i] = array1[i];
        }
        for (i=array1.length; i<array.length; i++) {
            array[i] = array2[i- array1.length];
        }
        System.out.println("Array1 " + Arrays.toString(array1));
        System.out.println("Array2 " + Arrays.toString(array2));
        System.out.println("Array after combine " + Arrays.toString(array));
    }
}
