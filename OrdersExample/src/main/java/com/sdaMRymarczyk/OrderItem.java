package com.sdaMRymarczyk;

public class OrderItem {

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Product product;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getCost() {
       return product.getPrice().multiplyBy(quantity);
    }
}
