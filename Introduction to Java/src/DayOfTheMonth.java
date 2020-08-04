import java.util.Scanner;

public class DayOfTheMonth {
    public static void main(String[] args) {
        byte month;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month do you need to count days?");
        month = scanner.nextByte();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.print("Month " + month + " have 31 days");
                break;
            case 4, 6, 9, 11:
                System.out.print("Month " + month + " have 30 days");
                break;
            case 2:
                System.out.print("Month " + month + " have 28 or days");
        }
    }
}
