package com.example.productmanagementsystem.utils;

public class Product {
    private String name;
    private double priceExcludingTax;
    private double VAT;

    // Constructor
    public Product(String name, double priceExcludingTax, double VAT) {
        this.name = name;
        this.priceExcludingTax = priceExcludingTax;
        this.VAT = VAT;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceExcludingTax() {
        return priceExcludingTax;
    }

    public void setPriceExcludingTax(double priceExcludingTax) {
        this.priceExcludingTax = priceExcludingTax;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }
}

