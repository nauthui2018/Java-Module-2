package homework.manageCustomer;

import java.util.Scanner;

public class Customer {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String gender;
    private String order;

    public Customer() {
    }

    public Customer(String mobile, String email) {
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getOrder() {
        return order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) { this.mobile = mobile; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setInformation() {
        System.out.println("Input name");
        this.name = scanner.nextLine();
        System.out.println("Input address");
        this.address = scanner.nextLine();
        System.out.println("Input gender");
        this.gender = scanner.nextLine();
        System.out.println("Input email");
        this.email = scanner.nextLine();
        System.out.println("Input mobile");
        this.mobile = scanner.nextLine();
        System.out.println("Input order");
        this.order = scanner.nextLine();
    }

    public Customer getCustomerInformation() {
        return this;
    }
}
