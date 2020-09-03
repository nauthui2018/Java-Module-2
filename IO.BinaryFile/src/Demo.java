import java.io.*;

public class Demo {
    public static String fileName = "demo.txt";

    public static void main(String[] args) {
        saveFile();
        getFile();
    }
    public static void saveFile() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos);
            //write data into file
            dos.writeInt(10);
            dos.writeDouble(100);

            //close stream
            fos.close();
            dos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void getFile() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);
            int number = dis.readInt();
            double value = dis.readDouble();
            fis.close();
            dis.close();
            System.out.println("number: " + number);
            System.out.println("value: " + value);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
