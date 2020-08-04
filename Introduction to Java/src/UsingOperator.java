import java.util.Scanner;

public class UsingOperator {
    public static void main(String[] args) {
        float width;
        float length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter length: ");
        length = scanner.nextFloat();
        float area = width * length;
        System.out.println("Area = " + area);
    }
}
