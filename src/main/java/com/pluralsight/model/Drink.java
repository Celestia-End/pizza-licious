package com.pluralsight.model;

public class Drink extends MenuItem {
    private String size;

    public Drink(String size) {
        super("Drink (" + size + ")", 0.0);
        this.size = size;
        setPrice();
    }

    private void setPrice() {
        switch (size.toLowerCase()) {
            case "small" -> price = 2.00;
            case "medium" -> price = 2.50;
            case "large" -> price = 3.00;
        }
    }

    public String getSize() {
        return size;
    }
}
