package com.company.Food;

public class McdonaldsBurger implements IOrderedFood{
    private double weight = 1.2;

    public McdonaldsBurger(){

    }

    @Override
    public String getOrderedFoodName() {
        return "Mcdonald's burger";
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
