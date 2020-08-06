import java.util.Scanner;

public class RankStudent {
    public static void main(String[] args) {
        String rank = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter average score:");
        double averageScore = scanner.nextDouble();
        if (averageScore < 5 && averageScore > 0) {
            rank = "E";
        } else if (averageScore < 6) {
            rank = "D";
        } else if (averageScore < 7) {
            rank = "C";
        } else if (averageScore < 8) {
            rank = "B";
        } else if (averageScore < 10){
            rank = "A";
        } else {
            rank = "Undefined";
            System.out.println("Invalid Score");
        }
        System.out.println("Rank: " + rank);
    }
}
