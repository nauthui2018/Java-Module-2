import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello!\n");
            writer.write("Hiihihi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read file
        try {
            File inFile = new File("demo.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
