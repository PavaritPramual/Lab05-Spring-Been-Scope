package com.example.lab05_bean_scope;

public class Coffee {
    private String id;
    private String name;
    private double price;

    // Constructor เปล่า
    public Coffee() {
    }

    // Constructor รับค่า
    public Coffee(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}