import java.util.Arrays;
import java.util.Scanner;

public class CountRepeatingTimeOfLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        int repeat;
        int i;
        int count = 0;
        boolean isExist = false;
        String[] letter = new String[20];
        for (i=0; i<str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            for (i=0; i<count; i++) {
                if (letter[i].equals(temp)) {
                    isExist = true;
                }
            }
            if (isExist) {
                continue;
            } else {
                letter[i] = temp;
                count ++;
                repeat = 1;
                for (int j=i+1; j<str.length(); j++) {
                    if (temp.equals(String.valueOf(str.charAt(j)))) {
                        repeat += 1;
                    }
                }
                System.out.println("Letter '" + temp +"' repeat " + repeat + " times");
                isExist = false;
            }
        }
        System.out.println(Arrays.toString(letter));
    }
}
