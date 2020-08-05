import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight: ");
        weight = scanner.nextFloat();
        System.out.println("Height: ");
        height = scanner.nextFloat();
        bmi = weight/Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("The IBM: " + bmi + " ==> " + "Result: Underweight");
        } else if (bmi < 25) {
            System.out.println("The IBM: " + bmi + " ==> " + "Result: Normal");
        } else if (bmi < 30) {
            System.out.println("The IBM: " + bmi + " ==> " + "Result: Overweight");
        } else {
            System.out.println("The IBM: " + bmi + " ==> " + "Result: Obese");
        }
    }
}
