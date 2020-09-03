package File;

import Model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FunctionFileTxt {
    private static final String DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String fileNameProduct = "product.txt";
    private static final String HEADER_PRODUCT = "id,name,producer,price,otherdescription";


    public static void writeProductToFileText(ArrayList<Product> productList) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameProduct);
            fileWriter.append(HEADER_PRODUCT);
            fileWriter.append(NEW_LINE);

            for (Product product : productList) {
                fileWriter.append(product.getId());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getName());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getProducer());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getPrice());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getOtherDescription());
                fileWriter.append(NEW_LINE);
            }


        } catch (Exception e) {
            System.out.println("Error when Computer write product to file text");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static ArrayList<Product> sendDataToProductsList() {
        BufferedReader reader = null;
        ArrayList<Product> productsList = new ArrayList<>();
        Path path = Paths.get(fileNameProduct);

        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter(fileNameProduct);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            reader = new BufferedReader(new FileReader(fileNameProduct));
            while ((line = reader.readLine()) != null) {
                String[] splitDate = line.split(",");
                if (splitDate[0].equals("id")) {
                    continue;
                }
                Product product = new Product();
                product.setId(splitDate[0]);
                product.setName(splitDate[1]);
                product.setProducer(splitDate[2]);
                product.setPrice(splitDate[3]);
                product.setOtherDescription(splitDate[4]);
                productsList.add(product);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productsList;
    }
}
