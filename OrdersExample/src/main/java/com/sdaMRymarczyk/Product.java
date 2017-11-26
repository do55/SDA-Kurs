package com.sdaMRymarczyk;

public class Product {


    private int id;
    private String name;
    private Money price;

    public Product(String name, Money price, ProductType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public enum ProductState {
        AVAILABLE, EXPIRED;
    }

    public enum ProductType {
        FOOD, DRINK, ELECTRONICS;
    }

    private ProductType type;

    public ProductType getType() {
        return type;
    }

    private Product state;

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

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Product getState() {
        return state;
    }

    public void setState(Product state) {
        this.state = state;
    }


    public boolean equals(Product product) {
        if (this.getName().equals(product.getName()) && this.getType().equals(product.getType())
                && this.getPrice().equals(product.getPrice())) {
            return true;
        }
        return false;
    }

}
