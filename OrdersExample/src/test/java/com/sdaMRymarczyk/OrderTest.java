package com.sdaMRymarczyk;

import com.sun.org.apache.xpath.internal.operations.Or;
import factory.OrderFactory;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void shouldAddTwoOrderItems() throws Exception {
        //GIVEN
        OrderFactory orderFactory = new OrderFactory();
        Client client = new Client("John", "Bravo", "john", Client.ClientType.REGULAR);
        Order order = orderFactory.createOrder(1, client);
        Product wine = new Product("Bordeaux", new Money(BigDecimal.valueOf(3.20)), Product.ProductType.DRINK);
        Product bread = new Product("chłopski", new Money(BigDecimal.valueOf(8.25)), Product.ProductType.FOOD);

        //WHEN
        order.addProduct(wine, 2);
        order.addProduct(bread,1);

        //THEN
        Product expectedBread = new Product("chłopski", new Money(BigDecimal.valueOf(8.25)), Product.ProductType.FOOD);
        Product actualProduct = order.getItem(1).getProduct();

        Assert.assertTrue("Product should be equal ", expectedBread.equals(actualProduct));
       }

    @Test
    public void shouldCurrentCostIsCorrect() throws Exception {
        //GIVEN
        OrderFactory orderFactory = new OrderFactory();
        Client client = new Client("John", "Bravo", "john", Client.ClientType.REGULAR);
        Order order = orderFactory.createOrder(1, client);
        Product wine = new Product("Bordeaux", new Money(BigDecimal.valueOf(3.20)), Product.ProductType.DRINK);
        Product bread = new Product("chłopski", new Money(BigDecimal.valueOf(8.25)), Product.ProductType.FOOD);
        order.addProduct(wine, 2);
        order.addProduct(bread,1);

        //WHEN

        Money currentCost = order.getCurrentCost();
        System.out.println(currentCost.getValue());

        //THEN
        Money expectedCost = new Money(14.65);
        Assert.assertTrue("Current cost should be same ", currentCost.compareValue(expectedCost));
    }

    @Test
    public void shouldTotalCostIsCorrect() throws Exception {
        //GIVEN
        OrderFactory orderFactory = new OrderFactory();
        Client client = new Client("John", "Bravo", "john", Client.ClientType.REGULAR);
        Order order = orderFactory.createOrder(1, client);
        Product wine = new Product("Bordeaux", new Money(BigDecimal.valueOf(3.20)), Product.ProductType.DRINK);
        Product bread = new Product("chłopski", new Money(BigDecimal.valueOf(8.25)), Product.ProductType.FOOD);
        order.addProduct(wine, 2);
        order.addProduct(bread,1);

        //WHEN

        Money totalCost = order.getTotalCost();
        System.out.println(totalCost.getValue());

        //THEN
        Money expectedCost = new Money(14.65 - 1.465);
        Assert.assertTrue("Total cost should be same ", totalCost.compareValue(expectedCost));
    }
}

