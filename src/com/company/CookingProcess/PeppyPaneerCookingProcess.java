package com.company.CookingProcess;

public class PeppyPaneerCookingProcess extends CookingPizzaTemplate{
    @Override
    protected void makeDough() {
        System.out.println("Making default dough");
    }

    @Override
    protected void addFilling() {
        System.out.println("Adding default sauce");
        System.out.println("Adding tomatoes");
        System.out.println("Adding bell pepper");
        System.out.println("Adding cheese");
    }

    @Override
    protected void bake() {
        System.out.println("Baking in default stove");
    }
}
