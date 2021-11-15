package com.company.PizzaDecorator.PizzaTypes;

import com.company.PizzaDecorator.Pizza;

public class FarmHouse extends Pizza
{
    public FarmHouse() {  description = "Farm house"; }

    @Override
    public int getCost() { return 200; }

    @Override
    public double getWeight() {
        return 0.9;
    }
}
