package com.example.productmanagementsystem.utils;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;

    // Constructor
    public ProductList() {
        products = new ArrayList<>();
        products.add(new Product("Laptop", 1000.0, 0.2));
        products.add(new Product("Phone", 600.0, 0.2));
        products.add(new Product("Tablet", 300.0, 0.2));
    }

    // Find Product by Name
    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // Return null if not found
    }
}

