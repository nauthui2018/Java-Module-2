import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        byte a,b;
        double solution;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextByte();
        System.out.println("Enter b: ");
        b = scanner.nextByte();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Every number is a solution");
            } else {
                System.out.println("There is no solution");
            }
        } else {
            solution = -b/a;
            System.out.println("Solution is" + solution);
        }
    }
}
