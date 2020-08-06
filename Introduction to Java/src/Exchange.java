import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount(USD):");
        double usd = scanner.nextInt();
        double rate = 23000;
        double vnd = usd * rate;
        System.out.println(vnd + "VND");
    }
}
