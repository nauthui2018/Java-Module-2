package homework.manageCustomer;

public class Interface {

    public static void main(String[] args) {
        Management management = new Management();
        Customer customer = new Customer();
        System.out.println("Chao mung ban den voi he thong quan ly khach hang");
        management.executeSelection();
    }
}
