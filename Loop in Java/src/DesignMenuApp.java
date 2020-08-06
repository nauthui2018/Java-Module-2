import java.util.Scanner;

public class DesignMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("Draw the triangle - select 1");
            System.out.println("Draw the square - select 2");
            System.out.println("Draw the rectangle - select 3");
            System.out.println("Exit - select 0");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("*");
                    System.out.println("* *");
                    System.out.println("* * *");
                    System.out.println("* * * *");
                    System.out.println("* * * * *");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
