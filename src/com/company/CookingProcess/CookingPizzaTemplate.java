package com.company.CookingProcess;

import com.company.PizzaDecorator.Pizza;

import java.util.Locale;

public abstract class CookingPizzaTemplate {

    protected Pizza pizza;

    public void cookPizza(Pizza pizza){
        this.pizza = pizza;
        this.makeDough();
        this.addFilling();
        this.addingSpecialFilling(pizza.getDescription().split(", "));
        this.bake();
    }

    // We can bake in special stove
    protected abstract void bake();

    protected abstract void addFilling();

    protected void addingSpecialFilling(String[] specialIngredients){
        if(specialIngredients.length > 1){
            for(int i=1; i<specialIngredients.length; i++){
                System.out.println("Adding " + specialIngredients[i].toLowerCase(Locale.ROOT));
            }
        }
    }

    // We can make special dough
    protected abstract void makeDough();
}
