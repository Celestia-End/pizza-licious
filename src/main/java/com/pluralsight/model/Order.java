package com.pluralsight.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<MenuItem> extras;
    private LocalDateTime orderTime;

    public Order(Customer customer) {
        this.customer = customer;
        this.extras = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
    }

    public void addExtra(MenuItem item) {
        extras.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem m : extras) total += m.getPrice();
        return total;
    }

    public String getOrderDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customer).append("\n");
        sb.append("Date: ").append(orderTime).append("\n\n");

        for (MenuItem m : extras) sb.append(m).append("\n");

        sb.append("\nTotal: $").append(String.format("%.2f", calculateTotal()));
        return sb.toString();
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getExtras() {
        return extras;
    }
}
