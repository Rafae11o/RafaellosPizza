package com.company.OrderState;

public class WrappingOrder implements IOrderState{
    @Override
    public String getOrderState() {
        return "Wrapping order";
    }
}
