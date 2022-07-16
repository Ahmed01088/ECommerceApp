package com.example.e_commerce.models;

public class MenModel {

    private String type;
    private String picture;
    private String nameOpProduct;
    private double price;
    public MenModel() {
    }

    public MenModel(String type, String picture, String nameOpProduct, double price) {
        this.type = type;
        this.picture = picture;
        this.nameOpProduct = nameOpProduct;
        this.price = price;
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

    public String getNameOpProduct() {
        return nameOpProduct;
    }

    public void setNameOpProduct(String nameOpProduct) {
        this.nameOpProduct = nameOpProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
