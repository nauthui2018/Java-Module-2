import java.io.*;

public class Stock implements Serializable {
    private int id;
    private String desc;
    private double price;
    private int quantity;
    public static String fileName = "saveObj.txt";

    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Khai bao mang
            Stock[] stocks = {
                    new Stock(1, "CD ROM", 100, 2)
                    ,new Stock(2, "CPU", 500, 2)
                    ,new Stock(3, "HP Scanner", 75, 1)
            };
            oos.writeObject(stocks);
            fos.close();
            oos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void getFile() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Stock arr[] = (Stock[]) ois.readObject();
            for(Stock item : arr){
                System.out.println(item.toString());
            }
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveFile();
        getFile();
    }
}
