import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = (number - number%100)/100;
        int tens = (number%100 - number%10)/10;
        int ones = (number%100)%10;
        String read = "";
        if (hundreds != 0) {
            switch (hundreds) {
                case 1:
                    read += "One";
                    break;
                case 2:
                    read += "Two";
                    break;
                case 3:
                    read += "Three";
                    break;
                case 4:
                    read += "Four";
                    break;
                case 5:
                    read += "Five";
                    break;
                case 6:
                    read += "Six";
                    break;
                case 7:
                    read += "Seven";
                    break;
                case 8:
                    read += "Eight";
                    break;
                case 9:
                    read += "Nine";
                    break;
            }
            read += " hundred";
            if (tens != 0) {
                read += " And ";
            }
        }
        if (tens > 1) {
            switch (tens) {
                case 2:
                    read += "Twenty";
                    break;
                case 3:
                    read += "Thirty";
                    break;
                case 4:
                    read += "Forty";
                    break;
                case 5:
                    read += "Fifty";
                    break;
                case 6:
                    read += "Sixty";
                    break;
                case 7:
                    read += "Seventy";
                    break;
                case 8:
                    read += "Eighty";
                    break;
                case 9:
                    read += "Ninety";
                    break;
            }
            if (ones != 0) {
                read += " ";
            }
        }
        if (hundreds != 0 || tens != 0) {
            switch (ones) {
                case 1:
                    read += "One";
                    break;
                case 2:
                    read += "Two";
                    break;
                case 3:
                    read += "Three";
                    break;
                case 4:
                    read += "Four";
                    break;
                case 5:
                    read += "Five";
                    break;
                case 6:
                    read += "Six";
                    break;
                case 7:
                    read += "Seven";
                    break;
                case 8:
                    read += "Eight";
                case 9:
                    read += "Nine";
            }
        }
        if (tens == 1 && hundreds ==0) {
            switch (ones) {
                case 0:
                    read = "Ten";
                    break;
                case 1:
                    read = "Eleven";
                    break;
                case 2:
                    read = "Twelve";
                    break;
                case 3:
                    read = "Thirteen";
                    break;
                case 4:
                    read = "Fourteen";
                    break;
                case 5:
                    read = "Fifteen";
                    break;
                case 6:
                    read = "Sixteen";
                    break;
                case 7:
                    read = "Seventeen";
                    break;
                case 8:
                    read = "Eighteen";
                    break;
                case 9:
                    read = "Nineteen";
                    break;
            }
        }
        if (hundreds == 0 && tens ==0) {
            switch (ones) {
                case 0:
                    read = "Zero";
                    break;
                case 1:
                    read = "One";
                    break;
                case 2:
                    read = "Two";
                    break;
                case 3:
                    read = "Three";
                    break;
                case 4:
                    read = "Four";
                    break;
                case 5:
                    read = "Five";
                    break;
                case 6:
                    read = "Six";
                    break;
                case 7:
                    read = "Seven";
                    break;
                case 8:
                    read = "Eight";
                    break;
                case 9:
                    read = "Nine";
                    break;
            }
        }
        System.out.println(read);
    }
}
