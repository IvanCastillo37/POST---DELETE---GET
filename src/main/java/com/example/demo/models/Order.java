package com.example.demo.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Represents an order entity in the system.
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long id;

    @Column
    private String productName;

    @Column
    private int quantity;

    @Column
    private double price;

    @Column
    private LocalDateTime orderDate;

    public Order(){
        this.orderDate = LocalDateTime.now();
    }

    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.orderDate = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public LocalDateTime getOrderDate() { return orderDate; }

    public void setProductName(String productName) { this.productName = productName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
}
