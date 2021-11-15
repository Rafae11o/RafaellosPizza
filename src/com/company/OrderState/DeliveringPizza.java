package com.company.OrderState;

public class DeliveringPizza implements IOrderState{
    @Override
    public String getOrderState() {
        return "Delivering pizza";
    }
}
