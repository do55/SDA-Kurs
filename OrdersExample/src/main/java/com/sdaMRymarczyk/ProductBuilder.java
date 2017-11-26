package com.sdaMRymarczyk;

public class ProductBuilder {

    private int id;
    private String name;
    private Money price;

    private Product.ProductType type;
    private Product state;

    public ProductBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder price(Money price) {
        this.price = price;
        return this;
    }

    public ProductBuilder type(Product.ProductType type) {
        this.type = type;
        return this;
    }

    public Product build() {
        return new Product(name, price, type);
    }
}
