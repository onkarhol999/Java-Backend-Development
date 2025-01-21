package com.onkar.ShoopingWebsiteUsingSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private LocalDate date;
    private int price;
    private String category;
    private boolean productAvalilable;
    private int stockQuantity;

    public Product(String name, LocalDate date, String description, String brand, int price, String category, boolean productAvalilable, int stockQuantity) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.productAvalilable = productAvalilable;
        this.stockQuantity = stockQuantity;
    }


    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isProductAvalilable() {
        return productAvalilable;
    }

    public void setProductAvalilable(boolean productAvalilable) {
        this.productAvalilable = productAvalilable;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
