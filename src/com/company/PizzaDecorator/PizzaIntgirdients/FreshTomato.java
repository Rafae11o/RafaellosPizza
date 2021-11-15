package com.company.PizzaDecorator.PizzaIntgirdients;

import com.company.PizzaDecorator.Pizza;
import com.company.PizzaDecorator.ToppingDecorator;

public class FreshTomato extends ToppingDecorator {

    private final Pizza pizza;

    public FreshTomato(Pizza pizza) { this.pizza = pizza; }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    @Override
    public int getCost() { return 40 + pizza.getCost(); }

    @Override
    public double getWeight() {return 0.15 + this.pizza.getWeight();}
}
