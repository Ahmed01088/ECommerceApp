package com.example.e_commerce.models;

public class SearchModel {
    private String message;

    public SearchModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
