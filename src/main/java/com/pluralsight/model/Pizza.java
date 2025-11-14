package com.pluralsight.model;

import java.util.ArrayList;

public class Pizza {
    private String size;
    private String crustType;
    private boolean stuffedCrust;
    private ArrayList<String> cheese = new ArrayList<>();
    private ArrayList<String> toppings = new ArrayList<>();
    private ArrayList<String> sauce = new ArrayList<>();

    public Pizza(String size, String crustType, boolean stuffedCrust, ArrayList<String> chees) {
        this.size = size;
        this.crustType = crustType;
        this.stuffedCrust = stuffedCrust;
    }

    public void addCheese(String type) {
        cheese.add(type);
    }

    public void addTopping(String type) {
        toppings.add(type);
    }

    public void addSauce(String type) {
        sauce.add(type);
    }

    public String getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public boolean isStuffedCrust() {
        return stuffedCrust;
    }

    public ArrayList<String> getCheese() {
        return new ArrayList<>(cheese);
    }

    public ArrayList<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    public ArrayList<String> getSauce() {
        return new ArrayList<>(sauce);
    }

    public double getPrice() {
        double price = 0;
        switch (size.toLowerCase()) {
            case "small" -> price = 8.0;
            case "medium" -> price = 10.0;
            case "large" -> price = 12.0;
            default -> price = 10.00;
        }

        return price;
    }
}
