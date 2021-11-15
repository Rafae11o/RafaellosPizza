package com.company.CookingProcess;

import java.util.Locale;

public class SimplePizzaCookingProcess extends CookingPizzaTemplate{
    @Override
    protected void makeDough() {
        System.out.println("Making default dough");
    }

    @Override
    protected void addFilling() {
        System.out.println("Adding default sauce");
        System.out.println("Adding sausages");
        System.out.println("Adding cheese");
    }

    @Override
    protected void bake() {
        System.out.println("Baking in default stove");
    }
}
