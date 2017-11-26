package com.sdaMRymarczyk;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderDraftState implements OrderState {


    @Override
    public void confirm(Order order) {
        System.out.println("draft confirmation");
        order.setState(Order.OrderState.CONFIRMED);
    }

    @Override
    public void pay(Order order) {
        System.out.println("draft confirmation and payment");
        order.setState(Order.OrderState.PAID);
    }

    @Override
    public void ship(Order order) throws OrderStateException{
        throw new OrderStateException("Draft order can't not be shipped.");

    }
}
