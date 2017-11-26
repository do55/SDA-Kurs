package com.sdaMRymarczyk;

import strategy.RebateStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;

    private Client client;

    public enum OrderState {
        DRAFT, PAID, CONFIRMED;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    private OrderState state;

    private List<OrderItem> items;

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderItem getItem(int position) {
        return items.get(position);
    }

    public void setRebateStrategy(RebateStrategy rebateStrategy) {
        this.rebateStrategy = rebateStrategy;
    }

    private RebateStrategy rebateStrategy;

    public Order(int orderId, Client client, OrderState state) {
        this.orderId = orderId;
        this.client = client;
        this.state = state;
    }

    public int getOrderId() {
        return orderId;
    }

    public Client getClient() {
        return client;
    }

    public void addProduct(Product product, int quantity) {
        if(items ==null) {
            items = new ArrayList<>();
        }
        OrderItem orderItem = new OrderItem(product, quantity);
        items.add(orderItem);
    }

    public Money getCurrentCost() {
        Money currentCost = new Money(BigDecimal.ZERO);
        if(items != null) {
            for(OrderItem item: items) {
                currentCost = currentCost.add(item.getCost());

            }
        }
    return currentCost;
    }
    public Money getTotalCost() {
        Money currentCost = getCurrentCost();
        Money rebate = rebateStrategy.calculateRebate(this);
        Money totalCost = currentCost.subtract(rebate);
        return totalCost;
    }
}
