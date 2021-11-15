package com.company.PizzaDecorator.PizzaTypes;

import com.company.PizzaDecorator.Pizza;

public class PeppyPaneer extends Pizza {
    public PeppyPaneer() { description = "Peppy paneer"; }

    @Override
    public int getCost() {  return 100; }

    @Override
    public double getWeight() {
        return 1.2;
    }
}
