package com.company.Food;

public class BurgerKing implements IOrderedFood {

    private double weight = 1;

    public BurgerKing(){
    }

    @Override
    public String getOrderedFoodName() {
        return "Burger king";
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
