import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[5];
        for (byte i=0; i<5; i++) {
            System.out.println("Enter array[" + i + "]");
            array[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(array));
    }
}
