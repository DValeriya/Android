package com.example.laba_03;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private String price;
    private String city;
    private String description;
    private int photo;

    public Car() {
    }

    public Car(String name, String price, String city, int photo, String description) {
        this.name = name;
        this.price = price;
        this.city = city;
        this.photo = photo;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
