package com.company.PizzaDecorator.PizzaTypes;

import com.company.PizzaDecorator.Pizza;

public class Margherita extends Pizza {

    public Margherita() { description = "Margherita"; }

    @Override
    public double getWeight() {
        return 1.1;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
