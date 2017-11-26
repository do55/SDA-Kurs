package com.sdaMRymarczyk;


public interface OrderState {

    public void confirm(Order order);
    public void pay(Order order);
    public void ship(Order order) throws OrderStateException;



}
