package com.hainguyen.model;

public class Products {
    private int id;
    private String name;
    private String description;
    private int amount;
    private int quantity;
    private String category;

    public Products() {
    }

    public Products(int id, String name, String description, int amount, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
