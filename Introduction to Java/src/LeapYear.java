import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Which year do you need to check?");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year%4 == 0) {
            if (year%100 != 0) {
                System.out.print(year + " is a leap year");
            } else {
                if (year%400 == 0){
                    System.out.print(year + " is a leap year");
                } else {
                    System.out.print(year + " is NOT a leap year");
                }
            }
        } else {
            System.out.print(year + " is NOT a leap year");
        }
    }
}
