package com.company.PizzaDecorator;

import com.company.Food.IOrderedFood;

public abstract class Pizza implements IOrderedFood {

    protected String description = "Unknown Pizza";
    protected double weight = 0;

    public String getDescription() {
        return description;
    }

    public String getOrderedFoodName(){ return "Rafaello's pizza"; }

    public double getWeight(){
        return this.weight;
    }

    public abstract int getCost();
}