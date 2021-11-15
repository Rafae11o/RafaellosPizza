package com.company.CookingProcess;

import com.company.PizzaDecorator.Pizza;
import com.company.PizzaDecorator.PizzaTypes.ChickenFiesta;
import com.company.PizzaDecorator.PizzaTypes.FarmHouse;
import com.company.PizzaDecorator.PizzaTypes.Margherita;
import com.company.PizzaDecorator.PizzaTypes.PeppyPaneer;

public class CookingPizzaProccess {

    private static CookingPizzaTemplate cookingPizzaTemplate;

    private static void defineCookingTemplate(Pizza pizza){
        String pizzaType = pizza.getDescription().split(", ")[0];
        if(pizzaType.equals("Chicken fiesta")){
            cookingPizzaTemplate = new ChickenFiestCookingProcess();
        } else if(pizzaType.equals("Farm house")){
            cookingPizzaTemplate = new FarmHouseCoockingProcess();
        } else if(pizzaType.equals("Margherita")){
            cookingPizzaTemplate = new MargheritaCookingProcess();
        } else if(pizzaType.equals("Peppy paneer")){
            cookingPizzaTemplate = new PeppyPaneerCookingProcess();
        } else {
            cookingPizzaTemplate = new SimplePizzaCookingProcess();
        }
    }

    public static void cookPizza(Pizza pizza){
        defineCookingTemplate(pizza);
        cookingPizzaTemplate.cookPizza(pizza);
    }

}
