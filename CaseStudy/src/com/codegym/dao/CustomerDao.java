package com.codegym.dao;

import com.codegym.entity.Customer;

import java.util.List;

public interface CustomerDao<T> {
    List<Customer> getAll();
    void save(T object);
    void update(T object);

}
