package com.company.CookingProcess;

public class ChickenFiestCookingProcess extends CookingPizzaTemplate{
    @Override
    protected void makeDough() {
        System.out.println("Making default dough");
    }

    @Override
    protected void addFilling() {
        System.out.println("Adding default sauce");
        System.out.println("Adding mushrooms");
        System.out.println("Adding chicken");
        System.out.println("Adding cheese");
    }

    @Override
    protected void bake() {
        System.out.println("Baking in special stove");
    }
}
