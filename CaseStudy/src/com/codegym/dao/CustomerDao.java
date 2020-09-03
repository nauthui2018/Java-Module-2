package com.codegym.dao;

import com.codegym.entity.Customer;

import java.util.ArrayList;

public interface CustomerDao {
    ArrayList<Customer> getAll();
    void add();
    boolean search();
    void update();
    void delete(String id);
    void printInfo(String id);
    void printAll();
    void updateOrder();
}
