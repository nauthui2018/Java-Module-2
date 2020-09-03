import java.util.Arrays;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7};
    public static void insertSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double key = list[i];
            int j = i -1;
            while (j>0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        insertSort(list);
        System.out.println(Arrays.toString(list));
    }
}
