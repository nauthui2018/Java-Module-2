package com.codegym.entity;

public class Customer {
    private String name;
    private String id;
    private String gender;
    private int age;
    private int order;
    private String shopID;
    private Shop shop = new Shop();

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getOrder() {
        return order;
    }

    public String getShopID() {
        return shopID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }
}
