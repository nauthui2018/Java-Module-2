package com.codegym.entity;

public class Shop {
    private String name;
    private String id;
    private String city;
    private Customer customer = new Customer();

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
