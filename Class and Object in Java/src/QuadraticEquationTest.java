import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0) {
            double r1 = quadraticEquation.getRoot1();
            double r2 = quadraticEquation.getRoot2();
            System.out.println("The equation has two roots:");
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        } else if (quadraticEquation.getDiscriminant() == 0) {
            double r = quadraticEquation.getRoot1();
            System.out.println("The equation has double root:");
            System.out.println("r1 = r2 = " + r);
        } else {
            System.out.println("The equation has no root");
        }

    }
}
