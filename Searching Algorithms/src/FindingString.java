import java.util.LinkedList;
import java.util.Scanner;

public class FindingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.next();
        LinkedList<Character> max = new LinkedList<>();
        int length = str.length();
        for (int i=0; i<length; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character item: max) {
            System.out.print(item);
        }
        System.out.println();
    }
}
