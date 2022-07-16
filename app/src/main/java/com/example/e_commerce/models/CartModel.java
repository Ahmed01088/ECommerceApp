package com.example.e_commerce.models;

public class CartModel {
    private String name,type,picture;
    private double price;
    public CartModel() {

    }

    public CartModel(String name, String type, String picture, double price) {
        this.name = name;
        this.type = type;
        this.picture = picture;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
