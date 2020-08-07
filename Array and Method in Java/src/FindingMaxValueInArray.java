import java.util.Arrays;
import java.util.Scanner;

public class FindingMaxValueInArray {
    public static void main(String[] args) {
        int i;
        double[] billionaire = new double[20];
        double wealthiest = billionaire[0];
        int position = 0;
        Scanner scanner = new Scanner(System.in);
        for (i=0; i< billionaire.length; i++) {
            System.out.println("Enter the worth");
            billionaire[i] = scanner.nextDouble();
            if (billionaire[i] > wealthiest) {
                wealthiest = billionaire[i];
                position = i;
            }
        }
        System.out.println(Arrays.toString(billionaire));
        System.out.println("Net worth: " + wealthiest + " at postion: " + position);
    }
}
