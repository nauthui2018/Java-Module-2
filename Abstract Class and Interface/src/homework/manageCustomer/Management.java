package homework.manageCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    Scanner scanner = new Scanner(System.in);
    private Customer customer = new Customer();
    private static int totalCustomer = 0;
    private boolean isExistedMobile;
    private boolean isExistedEmail;
    private int indexOfCustomer;
    private static ArrayList<Customer> customerList = new ArrayList<>();

    public Management() {
    }

    public static int getTotalCustomer() {
        return totalCustomer;
    }

    public static void setTotalCustomer(int totalCustomer) {
        Management.totalCustomer = totalCustomer;
    }

    public void inputNewCustomer() {
        Customer newCustomer = new Customer();
        newCustomer.setInformation();
        this.searchingByEmail(newCustomer.getEmail());
        this.searchingByMobile(newCustomer.getMobile());
        if (!isExistedEmail && !isExistedMobile) {
            customerList.add(newCustomer);
            totalCustomer++;
            System.out.println("Ban vua them moi khach hang " + newCustomer.getName() + " thanh cong");
        } else if (isExistedMobile) {
            Customer customerInSystem = customerList.get(indexOfCustomer);
            int oldOrder = Integer.parseInt(customerInSystem.getOrder());
            int newOrder = Integer.parseInt(newCustomer.getOrder());
            String totalOrder = String.valueOf(oldOrder + newOrder);
            newCustomer.setOrder(totalOrder);
            customerList.set(indexOfCustomer, newCustomer);
            System.out.println("Khach hang da ton tai, He thong vua update thong tin");
        }
    }

    public void printAllCustomers() {
        System.out.println("Thong tin khach hang:");
        int index = 1;
        for (Customer i: customerList) {
            System.out.print(index + ". ");
            this.printCustomer(i);
            index ++;
        }
        System.out.println("Tong co " + totalCustomer + " khach hang trong he thong");
    }

    //search by mobile
    public void searchingByMobile(String mobile) {
        isExistedMobile = false;
        indexOfCustomer = 0;
        for (Customer i: customerList) {
            if (i.getMobile().equals(mobile)) {
                isExistedMobile = true;
                break;
            }
            indexOfCustomer ++;
        }
    }

    //search by email
    public void searchingByEmail(String email) {
        isExistedEmail = false;
        indexOfCustomer = 0;
        for (Customer i: customerList) {
            if (i.getMobile().equals(email)) {
                isExistedEmail = true;
                break;
            }
            indexOfCustomer ++;
        }
    }

    public void printCustomer(Customer customer) {
        System.out.println("Khach hang: " + customer.getName() + ", " +
                "Dia chi: " + customer.getAddress() + ", " +
                "Email: " + customer.getEmail() + ", " +
                "So DT: " + customer.getMobile() + ", " +
                "Gioi tinh: " + customer.getGender() + ", " +
                "So don da mua: " + customer.getOrder());
    }

    public void updateOrder(Customer customer) {
        String currentOrder = customer.getOrder();
        System.out.println("Enter ordered quantity:");
        int newOrder = scanner.nextInt();
        int totalOrders = Integer.parseInt(currentOrder) + newOrder;
        customer.setOrder(String.valueOf(totalOrders));
    }

    public void exitSystem() {
        System.out.println("He thong Quan ly khach hang vua shutdown");
        System.exit(0);
    }

    public void showMenu() {
        System.out.println("Bấm 1 để nhập khách hang\n" +
                "Bấm 2 để tim kiem khach hang\n" +
                "Bam 3 de in thong khach hang\n" +
                "Bam 4 de in toan bo danh sach khach hang\n" +
                "Bam 5 de tang so don hang cho khach\n" +
                "Bam 0 de thoat\n" +
                "==========================================\n");
    }

    public void showIntroduction() {
        System.out.println("Chon menu de thuc hien tiep\n" +
                "==========================================\n");
    }

    public void executeSelection() {
        showMenu();
        int selection = scanner.nextInt();
        String mobile;
        while (selection != 0) {
            switch (selection) {
                case 1:
                    this.inputNewCustomer();
                    this.showMenu();
                    break;
                case 2,3:
                    System.out.println("Enter mobile number");
                    mobile = scanner.next();
                    this.searchingByMobile(mobile);
                    if (isExistedMobile) {
                        Customer temp = customerList.get(indexOfCustomer);
                        System.out.print("Thong tin KH: ");
                        this.printCustomer(temp);
                    } else {
                        System.out.println("Khong ton tai khach hang");
                    }
                    this.showIntroduction();
                    this.showMenu();
                    break;
                case 4:
                    this.printAllCustomers();
                    this.showIntroduction();
                    this.showMenu();
                    break;
                case 5:
                    System.out.println("Enter mobile number");
                    mobile = scanner.next();
                    this.searchingByMobile(mobile);
                    if (isExistedMobile) {
                        Customer i = customerList.get(indexOfCustomer);
                        this.updateOrder(i);
                        System.out.print("Thong tin KH: ");
                        this.printCustomer(i);
                    } else {
                        System.out.println("Khong ton tai khach hang");
                    }
                    this.showIntroduction();
                    this.showMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang. Vui long nhap lai");
                    this.showMenu();
            }
            selection = scanner.nextInt();
        }
        if (selection == 0) {
            this.exitSystem();
        }
    }
}



