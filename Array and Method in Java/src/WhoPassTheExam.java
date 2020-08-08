import java.util.Scanner;

public class WhoPassTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of student");
        int quantity = scanner.nextInt();
        while (quantity<1 || quantity>30) {
            System.out.println("Maximum is 30 students");
            quantity = scanner.nextInt();
        }
        int[] students = new int[quantity];
        int i;
        int count = 0;
        for (i=0; i< students.length; i++) {
            System.out.println("Enter score");
            students[i] = scanner.nextInt();
            if (students[i] >= 5) {
                count += 1;
            }
        }
        System.out.println(count + " students have passed the exam.");
    }
}
