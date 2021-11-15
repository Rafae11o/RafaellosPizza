package com.company;

import com.company.AppForDeliveryman.Pizzeria;
import com.company.CookingProcess.CookingPizzaProccess;
import com.company.Deliveryman.*;
import com.company.Food.BurgerKing;
import com.company.Food.KFCNuggets;
import com.company.Food.McdonaldsBurger;
import com.company.OrderState.CookingPizza;
import com.company.OrderState.IOrderState;
import com.company.OrderState.Order;
import com.company.PizzaDecorator.Pizza;
import com.company.PizzaDecorator.PizzaIntgirdients.Barbeque;
import com.company.PizzaDecorator.PizzaIntgirdients.FreshTomato;
import com.company.PizzaDecorator.PizzaIntgirdients.Paneer;
import com.company.PizzaDecorator.PizzaTypes.*;
import com.company.Wrapper.DefaultWrapper;
import com.company.Wrapper.SpecialGlovoWrapper;
import com.company.Wrapper.Wrapper;
import com.company.Wrapper.WrapperAdapter;

import java.util.Scanner;

public class Main {

    // Rafaello's pizzeria

    // State of order
    // Decorate pizza
    // Template of taking order
    // Strategy of delivers
    // Adapter for pizza box
    // Observer for deliveryman

    public static void main(String[] args) throws Exception {
        // Fill data by default
        Pizza pizza = null;
        Order orderState = new Order();
        Deliveryman chocofoodDeliveryman = new ChocofoodDeliveryman(150, 6);
        Deliveryman glovoDeliveryman = new GlovoDeliveryman(120, 4);
        Deliveryman woltDeliveryman = new WoltDeliveryman(140, 5);
        Deliveryman pizzeriasDeliveryman = new PizzeriasDeliveryman(400, 3);

        // Filling bugs for demonstration
        chocofoodDeliveryman.addOrderToBug(new BurgerKing());
        chocofoodDeliveryman.addOrderToBug(new McdonaldsBurger());
        chocofoodDeliveryman.addOrderToBug(new KFCNuggets());
        chocofoodDeliveryman.addOrderToBug(new BurgerKing());
        chocofoodDeliveryman.addOrderToBug(new McdonaldsBurger());

        woltDeliveryman.addOrderToBug(new BurgerKing());
        woltDeliveryman.addOrderToBug(new McdonaldsBurger());
        woltDeliveryman.addOrderToBug(new McdonaldsBurger());
        woltDeliveryman.addOrderToBug(new KFCNuggets());

        glovoDeliveryman.addOrderToBug(new McdonaldsBurger());

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.subscribeObserver(chocofoodDeliveryman);
        pizzeria.subscribeObserver(glovoDeliveryman);
        pizzeria.subscribeObserver(woltDeliveryman);
        pizzeria.subscribeObserver(pizzeriasDeliveryman);

        // Customer ordering pizza
        System.out.println("Welcome to Rafaello's pizzeria!!!");
        System.out.println("Choose pizza: ");
        System.out.println("1. Chicken fiesta");
        System.out.println("2. Farm house");
        System.out.println("3. Margherita");
        System.out.println("4. Peppy paneer");
        System.out.println("5. Simple pizza");
        System.out.print("Your input: ");
        Scanner scanner = new Scanner(System.in);
        int ans = scanner.nextInt();
        switch (ans) {
            case 1 -> {
                pizza = new ChickenFiesta();
            }
            case 2 -> {
                pizza = new FarmHouse();
            }
            case 3 -> {
                pizza = new Margherita();
            }
            case 4 -> {
                pizza = new PeppyPaneer();
            }
            case 5 -> {
                pizza = new SimplePizza();
            }
            default -> {
                throw new Exception("Illegal input");
            }
        }
        System.out.println("Choose additional ingredients: ");
        while(true){
            System.out.println("1. Barbeque");
            System.out.println("2. Fresh tomatoes");
            System.out.println("3. Paneer");
            System.out.println("0. Exit");
            System.out.print("Your input: ");
            ans = scanner.nextInt();
            if(ans == 0){
                break;
            }
            switch (ans){
                case 1 -> pizza = new Barbeque(pizza);
                case 2 -> pizza = new FreshTomato(pizza);
                case 3 -> pizza = new Paneer(pizza);
                default -> throw new Exception("Illegal input");
            }
            System.out.print("Continue?\n1. Yes\n2. No\n");
            System.out.print("Your input: ");
            ans = scanner.nextInt();
            if(ans == 2){
                break;
            }
        }
        System.out.println("========================================");
        System.out.printf("Your pizza: %s\n", pizza.getDescription());
        System.out.printf("Total cost: %d\n", pizza.getCost());
        System.out.println("Pizza weight " + pizza.getWeight());
        System.out.println("========================================\n");

        // PizzeriaAcceptsOrder
        System.out.println("========================================");
        orderState.changeOrderState();
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================\n");

        // CookingPizza
        System.out.println("========================================");
        orderState.changeOrderState();
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================");
        CookingPizzaProccess.cookPizza(pizza);
        System.out.println("========================================\n");

        // FindingDeliveryman
        orderState.changeOrderState();
        System.out.println("========================================");
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================");
        pizzeria.notifyObservers("New order");
        System.out.println("========================================");
        // Pizzerias delivery cost too much, so, we are trying to find another delivery service
        // If we will not find, we will use pizzeria's delivery
        Deliveryman deliverymanForPizza = pizzeriasDeliveryman;
        boolean isPossibleToAddNewOrder = chocofoodDeliveryman.isPossibleToAddNewOrder(pizza);
        if(isPossibleToAddNewOrder)deliverymanForPizza = chocofoodDeliveryman;
        else{
            isPossibleToAddNewOrder = woltDeliveryman.isPossibleToAddNewOrder(pizza);
            if(isPossibleToAddNewOrder) deliverymanForPizza = woltDeliveryman;
            else {
                isPossibleToAddNewOrder = glovoDeliveryman.isPossibleToAddNewOrder(pizza);
                if(isPossibleToAddNewOrder) deliverymanForPizza = glovoDeliveryman;
            }
        }
        System.out.printf("Our delivery service: %s\n", deliverymanForPizza.getDeliveryServiceName());
        System.out.println("Delivery cost: " + deliverymanForPizza.getDeliveryCost());
        System.out.println("========================================\n");

        // Wrapping order
        System.out.println("========================================");
        Wrapper wrapper = null;
        // Glovo has a special wrapper for shipping
        if(deliverymanForPizza.getDeliveryServiceName().equals("Glovo")){
            wrapper = new WrapperAdapter(new SpecialGlovoWrapper());
        } else {
            wrapper = new DefaultWrapper();
        }
        orderState.changeOrderState();
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================");
        wrapper.wrap();
        System.out.println("========================================\n");

        // PickingUpPizza
        System.out.println("========================================");
        orderState.changeOrderState();
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================\n");

        // DeliveringPizza
        System.out.println("========================================");
        orderState.changeOrderState();
        System.out.printf("Order state: %s\n", orderState.getOrderState());
        System.out.println("========================================\n");

        // End
        orderState.changeOrderState();
    }
}
