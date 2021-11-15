package com.company.CookingProcess;

public class MargheritaCookingProcess extends CookingPizzaTemplate {
    @Override
    protected void makeDough() {
        System.out.println("Making special dough");
    }

    @Override
    protected void addFilling() {
        System.out.println("Adding default sauce");
        System.out.println("Adding sausages");
        System.out.println("Adding cheese");
    }

    @Override
    protected void bake() {
        System.out.println("Baking in special stove");
    }
}
