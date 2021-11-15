package com.company.PizzaDecorator.PizzaTypes;

import com.company.PizzaDecorator.Pizza;

public class SimplePizza extends Pizza {

    public SimplePizza(){description = "Simple pizza";}

    @Override
    public int getCost() {return 50;}

    @Override
    public double getWeight() {
        return 1;
    }
}
