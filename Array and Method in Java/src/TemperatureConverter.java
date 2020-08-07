import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        double celsius;
        double fahrenheit;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Which function do you choose?");
            select = scanner.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter fahrenheit temperature:");
                    fahrenheit = scanner.nextDouble();
                    System.out.print("Celsius temperature: ");
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius temperature:");
                    celsius = scanner.nextDouble();
                    System.out.print("Fahrenheit temperature: ");
                    System.out.println(celsiusToFahrenheit(celsius));
                    break;
            }
        }
        while (select != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return 9/5*celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }
}
