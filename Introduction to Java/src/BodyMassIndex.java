import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, ibm;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight: ");
        weight = scanner.nextFloat();
        System.out.println("Height: ");
        height = scanner.nextFloat();
        ibm = weight/Math.pow(height, 2);
        if (ibm < 18.5) {
            System.out.println("The IBM: " + ibm + " ==> " + "Result: Underweight");
        } else if (ibm < 25) {
            System.out.println("The IBM: " + ibm + " ==> " + "Result: Normal");
        } else if (ibm < 30) {
            System.out.println("The IBM: " + ibm + " ==> " + "Result: Overweight");
        } else {
            System.out.println("The IBM: " + ibm + " ==> " + "Result: Obese");
        }
    }
}
