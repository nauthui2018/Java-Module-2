import java.io.*;

public class CSVReader {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("countries.csv");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        String cvsSplitBy = ",";
        try {
            while ((line = reader.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country: [Code=" + country[4] +
                        "name=" + country[5] + "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
