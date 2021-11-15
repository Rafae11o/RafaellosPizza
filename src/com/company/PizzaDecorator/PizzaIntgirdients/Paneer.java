package com.company.PizzaDecorator.PizzaIntgirdients;

import com.company.PizzaDecorator.Pizza;
import com.company.PizzaDecorator.ToppingDecorator;

public class Paneer extends ToppingDecorator {
    private final Pizza pizza;

    public Paneer(Pizza pizza)  {  this.pizza = pizza; }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Paneer";
    }

    @Override
    public int getCost()  {  return 70 + pizza.getCost(); }

    @Override
    public double getWeight() {return 0.05 + this.pizza.getWeight();}
}
