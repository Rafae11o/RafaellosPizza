package com.company.CookingProcess;

public class FarmHouseCoockingProcess extends CookingPizzaTemplate{
    @Override
    protected void makeDough() {
        System.out.println("Making special dough");
    }

    @Override
    protected void addFilling() {
        System.out.println("Adding default sauce");
        System.out.println("Adding meat");
        System.out.println("Adding bell pepper");
        System.out.println("Adding cheese");
    }

    @Override
    protected void bake() {
        System.out.println("Baking in default stove");
    }
}
