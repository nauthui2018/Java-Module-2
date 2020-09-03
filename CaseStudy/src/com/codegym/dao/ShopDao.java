package com.codegym.dao;

import com.codegym.entity.Shop;

import java.util.ArrayList;

public interface ShopDao {
    ArrayList<Shop> getAll();
    void add();
    void delete();
    void search();
}
