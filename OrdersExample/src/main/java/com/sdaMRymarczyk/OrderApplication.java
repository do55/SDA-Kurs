package com.sdaMRymarczyk;

import factory.OrderFactory;

import java.math.BigDecimal;

public class OrderApplication {

    public static void main(String[] args) {

        OrderFactory orderFactory = new OrderFactory();
        Client client = new Client("John", "Bravo", "john", Client.ClientType.REGULAR);
        Order order = orderFactory.createOrder(1,client);
        System.out.println("Order with id = " + order.getOrderId() + " was created");
        Product wine = new Product("Bordeaux", new Money(BigDecimal.valueOf(3.20)), Product.ProductType.DRINK);
        Product cellularPhone = new Product("Iphone", new Money(BigDecimal.valueOf(7996.20)), Product.ProductType.ELECTRONICS);
        Product bread = new Product("bread", new Money(BigDecimal.valueOf(8.25)), Product.ProductType.FOOD);
        order.addProduct(wine, 2);
        order.addProduct(bread, 1);
        order.addProduct(cellularPhone, 1);
        Money currentCost = order.getCurrentCost();
        Money costAfterDiscout = order.getTotalCost();
        System.out.println("Order with id " + order.getOrderId() + " cost " + currentCost.getValue());
        System.out.println("Order with id " + order.getOrderId() + " cost " + costAfterDiscout.getValue());


        Client client1 = new ClientBuilder()
                .firstName("Mike")
                .lastName("Park")
                .build();
    }
}
