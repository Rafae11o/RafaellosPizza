package com.company.OrderState;

public class CookingPizza implements IOrderState{

    @Override
    public String getOrderState() {
        return "Pizza is cooking";
    }
}
