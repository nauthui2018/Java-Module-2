import java.util.Scanner;

public class ShowPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        int i = 0;
        int j = 0;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("Draw the rectangle - select 1");
            System.out.println("Draw the square triangle - select 2");
            System.out.println("Draw the isosceles triangle - select 3");
            System.out.println("Exit - select 0");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("Enter the length");
                    int length = scanner.nextInt();
                    System.out.println("Enter the width");
                    int width = scanner.nextInt();
                    for (i=0; i<length; i++) {
                        for (j=0; j<width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    System.out.println("Enter the length side");
                    int side = scanner.nextInt();
                    for (i=1; i<= side; i++) {
                        for (j=1; j<=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (i=0; i<side; i++) {
                        for (j = 0; j < side; j++) {
                            if (i + j < side) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (i=0; i < side; i++) {
                        for (j = 0; j < side; j++) {
                            if (i + j < side-1) {
                                System.out.print("  ");
                            }
                            if (i+j >= side-1) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (i=0; i<side; i++) {
                        for (j=0; j<side; j++) {
                            if (j>=i) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    System.out.println("Enter the length side");
                    side = scanner.nextInt();
                    if (side%2 != 0) {
                        int space = (side - 1) / 2;
                        while (space >= 0) {
                            for (i = 0; i < space; i++) {
                                System.out.print(" ");
                            }
                            for (j = space; j < side - space; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            space--;
                        }
                    } else {
                        int space = side/2;
                        while (space >= 0) {
                            for (i = 0; i < space; i++) {
                                System.out.print(" ");
                            }
                            for (j = space; j < side - space +1; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            space--;
                        }
                    }
                    break;
            }
        }
    }
}
