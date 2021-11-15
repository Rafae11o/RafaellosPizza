package com.company.Food;

public class KFCNuggets implements IOrderedFood{
    private double weight = 1.1;

    public KFCNuggets(){

    }

    @Override
    public String getOrderedFoodName() {
        return "KFC nuggets";
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
