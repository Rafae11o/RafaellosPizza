package com.company.PizzaDecorator.PizzaTypes;

import com.company.PizzaDecorator.Pizza;

public class ChickenFiesta extends Pizza {

    public ChickenFiesta() { description = "Chicken fiesta";}

    @Override
    public double getWeight() {
        return 1;
    }

    @Override
    public int getCost() {return 200;}

}
