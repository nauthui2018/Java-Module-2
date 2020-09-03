package com.codegym.dao;

import com.codegym.entity.Customer;
import com.codegym.entity.Shop;

import java.io.*;
import java.util.ArrayList;

public class FileUtil {
    ArrayList<Shop> shopList = new ArrayList<>();
    ArrayList<Customer> customerList = new ArrayList<>();
    private String fileName;

    public void saveShop() {
        try {
            fileName = "shop.txt";
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Shop item: shopList) {
                writer.append(item.getId());
                writer.append(",");
                writer.append(item.getName());
                writer.append(",");
                writer.append(item.getCity());
                writer.append("\n");
            }
            fileWriter.close();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Shop> getShop() {
        try {
            fileName = "shop.txt";
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            String[] temp = line.split(",");
            Shop shop = new Shop();
            shopList = null;
            while (line != null) {
                shop.setId(temp[0]);
                shop.setName(temp[1]);
                shop.setCity(temp[2]);
                shopList.add(shop);
            }
            fileReader.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return shopList;
    }

    public void saveCustomer() {
        try {
            fileName = "customer.txt";
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Customer item: customerList) {
                writer.append(item.getId());
                writer.append(",");
                writer.append(item.getName());
                writer.append(",");
                writer.append(item.getGender());
                writer.append(",");
                writer.append(String.valueOf(item.getAge()));
                writer.append(",");
                writer.append(String.valueOf(item.getOrder()));
                writer.append(",");
                writer.append(item.getShopID());
                writer.append("\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Customer> getCustomer() {
        try {
            fileName = "customer.txt";
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            Customer customer = new Customer();
            String[] temp = line.split(",");
            customerList = null;
            while (line != null) {
                customer.setId(temp[0]);
                customer.setName(temp[1]);
                customer.setGender(temp[2]);
                customer.setAge(Integer.valueOf(temp[3]));
                customer.setOrder(Integer.valueOf(temp[4]));
                customer.setShopID(temp[5]);
                customerList.add(customer);
            }
            fileReader.close();
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return customerList;
    }
}
