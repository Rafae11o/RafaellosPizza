package com.company.PizzaDecorator.PizzaIntgirdients;

import com.company.PizzaDecorator.Pizza;
import com.company.PizzaDecorator.ToppingDecorator;

public class Barbeque extends ToppingDecorator {
    private final Pizza pizza;

    public Barbeque(Pizza pizza) {  this.pizza = pizza;  }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Barbeque";
    }

    @Override
    public int getCost() { return 90 + this.pizza.getCost(); }

    @Override
    public double getWeight() {return 0.1 + this.pizza.getWeight();}
}