package com.company.OrderState;

public class PickingUpPizza implements IOrderState{

    @Override
    public String getOrderState() {
        return "The delivery man picks up the pizza";
    }
}
