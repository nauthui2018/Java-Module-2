package com.codegym.dao.impl;

import com.codegym.dao.CustomerDao;
import com.codegym.dao.FileUtil;
import com.codegym.entity.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerDaoImpl implements CustomerDao {
    Customer customer = new Customer();
    ArrayList<Customer> customerList = new ArrayList<>();
    FileUtil list = new FileUtil();
    Scanner scanner = new Scanner(System.in);
    private boolean isExist;
    Customer temp;

    @Override
    public ArrayList<Customer> getAll() {
        return list.getCustomer();
    }

    @Override
    public void add() {
        try {
            if (search()) {
                Customer customer = new Customer();
                System.out.println("Create new customer's ID");
                customer.setId(scanner.next());
                System.out.println("Enter name:");
                customer.setName(scanner.next());
                System.out.println("Enter gender:");
                customer.setGender(scanner.next());
                System.out.println("Enter age:");
                customer.setAge(scanner.nextInt());
                System.out.println("Enter your shop ID");
                customer.setShopID(scanner.next());
                System.out.println("Total orders");
                customer.setOrder(scanner.nextInt());
                customerList.add(customer);
                list.saveCustomer();
            } else {
                update();
            }
        } catch (Exception e) {
            System.out.println("Error during add new customer. Please try again!");
        }
    }

    @Override
    public boolean search() {
        getAll();
        System.out.println("Enter customer's ID:");
        String id = scanner.next();
        Customer customer = new Customer();
        isExist = false;
        int length = customerList.size();
        for (int i=0; i<length; i++) {
            customer = customerList.get(i);
            if (customer.getId() == id) {
                isExist = true;
                temp = customer;
                break;
            }
        }
        return isExist;
    }

    @Override
    public void update() {
        getAll();
        String id = temp.getId();
        int length = customerList.size();
        String selected;
        for (int i=0; i<length; i++) {
            temp = customerList.get(i);
            if (customer.getId() == id) {
                //update name
                System.out.println("Name: " + temp.getName());
                System.out.println("Do you want to update name? \n" +
                        "Y: Yes \n" +
                        "N: No");
                selected = scanner.next();
                if (selected == "Y") {
                    temp.setName(scanner.next());
                } if (selected != "Y" && selected != "N") {
                    System.out.println("Please press Y or N");
                }
                //update age
                System.out.println("Name: " + temp.getAge());
                System.out.println("Do you want to update age? \n" +
                        "Y: Yes \n" +
                        "N: No");
                selected = scanner.next();
                if (selected == "Y") {
                    temp.setAge(scanner.nextInt());
                } if (selected != "Y" && selected != "N") {
                    System.out.println("Please press Y or N");
                }
                //update gender
                System.out.println("Name: " + temp.getGender());
                System.out.println("Do you want to update gender? \n" +
                        "Y: Yes \n" +
                        "N: No");
                selected = scanner.next();
                if (selected == "Y") {
                    temp.setGender(scanner.next());
                } if (selected != "Y" && selected != "N") {
                    System.out.println("Please press Y or N");
                }
            }
        }
        list.saveCustomer();
    }

    @Override
    public void delete(String id) {
        getAll();
        System.out.println("Enter customer's ID:");
        id = scanner.next();
        Customer customer = new Customer();
        int length = customerList.size();
        for (int i=0; i<length; i++) {
            customer = customerList.get(i);
            if (customer.getId() == id) {
                customerList.remove(customer);
                break;
            }
        }
        list.saveCustomer();
    }


    @Override
    public void printInfo(String id) {
        int length = customerList.size();
        Customer customer = new Customer();
        if (isExist) {
            for (int i=0; i<length; i++) {
                customer = customerList.get(i);
                if (customer.getId() == id) {
                    System.out.println("Customer's information: \n" +
                            "ID: " + customer.getId() + "\n" +
                            "Name: " + customer.getName() + "\n" +
                            "Gender: " + customer.getGender() + "\n" +
                            "Age: " + customer.getAge() + "\n" +
                            "Total orders: " + customer.getOrder() + "\n" +
                            "Register at: Shop " + customer.getShopID());
                }
            }
        } else {
            System.out.println("Can not found customer: " + id);
        }
    }

    @Override
    public void printAll() {
        ArrayList<Customer> customerList = getAll();
        System.out.println("Customer's information:");
        int count = 1;
        for (Customer item: customerList) {
            System.out.println(count + ". " +
                    "ID: " + item.getId() + "," +
                    "Name: " + item.getName() + "," +
                    "Gender: " + item.getGender() + "," +
                    "Age: " + item.getAge() + "," +
                    "Total orders: " + item.getOrder() + "," +
                    "Register at: Shop " + item.getShopID() + ".");
        }
    }

    @Override
    public void updateOrder() {

    }
}
