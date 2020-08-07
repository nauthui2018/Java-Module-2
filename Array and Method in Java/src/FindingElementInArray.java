import java.util.Scanner;

public class FindingElementInArray {
    public static void main(String[] args) {
        String[] students = {
                "Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor",
                "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist = false;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you finding?");
        String name = scanner.nextLine();
        for (i=0; i< students.length; i++) {
            if (students[i].equals(name)) {
                isExist = true;
                System.out.println("Index of " + name + ":" + i);
            }
        }
        if (!isExist) {
            System.out.println("No result for " + name);
        }
    }
}
