import java.util.Arrays;
import java.util.Scanner;

public class CountRepeatingTimeOfLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        int repeat;
        int i,j,k;
        int count = 0;
        boolean isExist = false;
        String[] letter = new String[str.length()];
        String temp;
        for (i=0; i<str.length(); i++) {
            temp = String.valueOf(str.charAt(i));
            for (j=0; j<count; j++) {
                if (temp.equals(letter[j])) {
                    isExist = true;
                }
            }
            if (isExist) {
                isExist = false;
                continue;
            } else {
                letter[j] = temp;
                count ++;
                repeat = 1;
                for (k=i+1; k<str.length(); k++) {
                    if (temp.equals(String.valueOf(str.charAt(k)))) {
                        repeat += 1;
                    }
                }
                System.out.println("Letter '" + temp +"' repeat " + repeat + " times");
            }
        }
        System.out.println(Arrays.toString(letter));
    }
}
