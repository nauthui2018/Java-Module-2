package productManagement;

import java.util.*;

public class ProductManager {
    private Product product;
    private  static Map<String,Product> productsList = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void showMenu() {
        System.out.println("Press 1 to input new product\n" +
                "Press 2 to edit product's information by ID\n" +
                "Press 3 to remove product by ID\n" +
                "Press 4 to show list products\n" +
                "Press 5 to search product by name\n" +
                "Press 6 to sort products by price\n" +
                "Press 0 to exit\n" +
                "==========================================\n");
    }

    public void showIntroduction() {
        System.out.println("Choose your selection to continue\n" +
                "==========================================\n");
    }

    public void exit() {
        System.out.println("System has been exited");
        System.exit(0);
    }

    public void inputNewProduct() {
        System.out.println("Input product's ID");
        String id = scanner.next();
        System.out.println("Input product's name");
        String name = scanner.next();
        System.out.println("Input product's price");
        int price = scanner.nextInt();
        System.out.println("Input product's quantity");
        int quantity = scanner.nextInt();
        Product product = new Product(name, id, quantity, price);
        productsList.put(id, product);
    }

    public void editProduct() {
        System.out.println("Input product's ID");
        String id = scanner.next();
        if (productsList.containsKey(id)) {
            Product product = productsList.get(id);
        } else {
            System.out.println("This ID is not valid");
        }
        //update name
        System.out.println("Product name: " + product.getName());
        showUpdateMenu();
        String selected = scanner.next();
        while (selected != "Y" || selected != "N") {
            System.out.println("Please press Y or N");
        }
        editName(selected);
        //update ID
        System.out.println("Product ID: " + product.getId());
        showUpdateMenu();
        selected = scanner.next();
        while (selected != "Y" || selected != "N") {
            System.out.println("Please press Y or N");
        }
        editID(selected);
        //update price
        System.out.println("Product ID: " + product.getPrice());
        showUpdateMenu();
        selected = scanner.next();
        while (selected != "Y" || selected != "N") {
            System.out.println("Please press Y or N");
        }
        editPrice(selected);
        //update quantity
        System.out.println("Product ID: " + product.getQuantity());
        showUpdateMenu();
        selected = scanner.next();
        while (selected != "Y" || selected != "N") {
            System.out.println("Please press Y or N");
        }
        editQuantity(selected);
        productsList.put(id, product);
    }

    public void showUpdateMenu() {
        System.out.println("Do you want update this item?\n" +
                "Press Y to update.\n" +
                "Press N to review next items");
    }

    public void editName(String selected) {
        switch (selected) {
            case "Y":
                System.out.println("Input new product name");
                String name = scanner.next();
                product.setName(name);
                break;
            case "N":
                break;
        }
    }

    public void editID(String selected) {
        switch (selected) {
            case "Y":
                System.out.println("Input new product ID");
                String id = scanner.next();
                product.setId(id);
                break;
            case "N":
                break;
        }
    }

    public void editPrice(String selected) {
        switch (selected) {
            case "Y":
                System.out.println("Input new product price");
                int price = scanner.nextInt();
                product.setPrice(price);
                break;
            case "N":
                break;
        }
    }

    public void editQuantity(String selected) {
        switch (selected) {
            case "Y":
                System.out.println("Input new product ID");
                int quantity = scanner.nextInt();
                product.setQuantity(quantity);
                break;
            case "N":
                break;
        }
    }

    public void removeProduct() {
        System.out.println("Input product ID");
        String id = scanner.next();
        if (productsList.containsKey(id)) {
            Product product = productsList.remove(id);
            System.out.println("Product " + product.getName() + " has been removed out of products list");
        } else {
            System.out.println("Can not found product ID: " + id);
        }
    }

    public void showProducts() {
        for (Map.Entry<String, Product> entry : productsList.entrySet()) {
            Product product = entry.getValue();
            System.out.println("Product: " + product.getName() + "\n" +
                    "ID: " + product.getId() + "\n" +
                    "Price: " + product.getPrice() + "\n" +
                    "Quantity: " + product.getQuantity());
        }
    }

    public void searchProduct() {
        System.out.println("Input product's name");
        String name = scanner.next();
        boolean isExist = false;
        for (Map.Entry<String, Product> entry : productsList.entrySet()) {
            Product product = entry.getValue();
            if (product.getName() == name) {
                System.out.println("Product: " + product.getName() + "\n" +
                        "ID: " + product.getId() + "\n" +
                        "Price: " + product.getPrice() + "\n" +
                        "Quantity: " + product.getQuantity());
            } else {
                System.out.println("Product name is not valid");
            }
        }
    }

    public void sortProducts() {
        Collection<Product> products = productsList.values();
        List<Integer> prices = new ArrayList<>();
    }

    public void executeSelection() {
        showMenu();
        int selection = scanner.nextInt();
        while (selection != 0) {
            switch (selection) {
                case 1:
                    this.inputNewProduct();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 2:
                    this.editProduct();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 3:
                    this.removeProduct();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 4:
                    this.showProducts();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 5:
                    this.searchProduct();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 6:
                    this.sortProducts();
                    this.showMenu();
                    this.showIntroduction();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Your input is not valid. Please  see below!");
                    this.showMenu();
            }
            selection = scanner.nextInt();
        }
        if (selection == 0) {
            this.exit();
        }
    }
}
