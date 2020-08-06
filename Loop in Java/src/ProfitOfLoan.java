import java.util.Scanner;

public class ProfitOfLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of loan (million VND)");
        int loan = scanner.nextInt();
        System.out.println("Enter the rate (%)");
        double rate = scanner.nextDouble();
        System.out.println("How many month?");
        int month = scanner.nextInt();
        double profit = 0;
        for (int i = 1; i <= month; i++) {
            profit += rate/100*loan;
        }
        System.out.println("Total profit: " + profit + " million VND");
    }
}
