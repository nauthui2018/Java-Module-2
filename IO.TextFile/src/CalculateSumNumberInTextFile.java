import java.io.*;
import java.util.Scanner;

public class CalculateSumNumberInTextFile {
    public static void readFileText(String filePath) {

        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("File is not found or data is not numbers");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter link of your file:");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        readFileText(filePath);
    }
}

