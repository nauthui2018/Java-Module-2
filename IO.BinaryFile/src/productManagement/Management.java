package productManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Management {
    private Product product = new Product();
    public static ArrayList<Product> productList = new ArrayList<>();

    private static void saveFile(ArrayList<Product> productList) {
        try {
            File file = new File("product.txt");
            FileWriter writer = new FileWriter(file);
            String line = null;
            for (Product product: productList) {
                writer.append(product.getName());
                writer.append(",");
                writer.append(product.getId());
                writer.append(",");
                writer.append(product.getManufacturer());
                writer.append(",");
                writer.append(product.getPrice());
                writer.append(",");
                writer.append(product.getDetail());
                writer.append("\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> getFile() {
        try {
            File file = new File("product.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            productList = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                Product product = new Product();
                String[] temp = line.split(",");
                product.setName(temp[0]);
                product.setId(temp[1]);
                product.setManufacturer(temp[2]);
                product.setPrice(temp[3]);
                product.setDetail(temp[4]);
                productList.add(product);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
//        Product product = new Product();
//        product.setName("Samsung");
//        product.setId("001");
//        product.setManufacturer("Samsung");
//        product.setPrice("1000");
//        product.setDetail("Color: Black");
//        productList.add(product);
//        Product product1 = new Product();
//        product1.setName("Nokia");
//        product1.setId("002");
//        product1.setManufacturer("Nokia");
//        product1.setPrice("500");
//        product1.setDetail("Color: Gold");
//        productList.add(product1);
//        saveFile(productList);
//        for (Product item: productList) {
//            System.out.println(item.toString());
//        }
        getFile();
        for (Product item: productList) {
            System.out.println(item.toString());
        }
    }
}
