import java.util.Scanner;

public class GreatestCommonDivisor {
    public static boolean tryParse(String str){

        try{
            int value = Integer.parseInt(str);
            return  true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String value1 = scanner.nextLine();
        while (!tryParse(value1)) {
            System.out.println("Please enter a number");
            value1 = scanner.nextLine();
        }
        int number1 = Integer.parseInt(value1);
        while (number1<0) {
            System.out.println("Please enter a positive integer");
            value1 = scanner.nextLine();
            while (!tryParse(value1)) {
                System.out.println("Please enter a number");
                value1 = scanner.nextLine();
            }
            number1 = Integer.parseInt(value1);
        }
        System.out.println("Enter the second number");
        String value2 = scanner.nextLine();
        while (!tryParse(value2)) {
            System.out.println("Please enter a number");
            value2 = scanner.nextLine();
        }
        int number2 = Integer.parseInt(value2);
        while (number2<0) {
            System.out.println("Please enter a positive integer");
            value2 = scanner.nextLine();
            while (!tryParse(value2)) {
                System.out.println("Please enter a number");
                value2 = scanner.nextLine();
            }
            number2 = Integer.parseInt(value2);
        }
        int greatest = 0;
        if (number1 == 0 && number2 == 0) {
            System.out.println("There is no greatest common divisor");
        } else if (number1 == 0 && number2 != 0) {
            System.out.println(number2 + " is greatest common divisor");
        } else if (number1 != 0 && number2 == 0) {
            System.out.println(number1 + " is greatest common divisor");
        } else {
            for (int i=1; i<=number1; i++) {
                if (number1%i == 0 && number2%i == 0) {
                    greatest = i;
                }
                if (i==number2) {
                    break;
                }
            }
            System.out.println(greatest + " is greatest common divisor");
        }
    }
}
