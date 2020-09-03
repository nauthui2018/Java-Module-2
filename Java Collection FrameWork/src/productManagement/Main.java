package productManagement;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        System.out.println("WELCOME TO MANAGEMENT SYSTEM!");
        productManager.executeSelection();
    }
}
