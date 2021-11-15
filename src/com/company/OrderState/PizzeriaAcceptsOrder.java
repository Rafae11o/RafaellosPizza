package com.company.OrderState;

public class PizzeriaAcceptsOrder implements IOrderState{
    @Override
    public String getOrderState() {
        return "Pizzeria accepts order";
    }
}
