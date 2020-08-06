import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int i = 2;
        boolean isPrime = true;
        for (i = 2 ; i <= Math.sqrt(number); i++) {
            if (number%i ==0) {
                System.out.println(number + " is not a prime number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime number");
        }
    }
}
