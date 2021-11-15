package com.company.Deliveryman;

public class PizzeriasDeliveryman extends Deliveryman {

    public PizzeriasDeliveryman(int deliveryCost, double bugCapacity) {
        super(deliveryCost, bugCapacity);
    }

    @Override
    public String getDeliveryServiceName() {
        return "Rafaello's pizzeria";
    }

    @Override
    public void notify(String msg) {
        System.out.printf("Pizzerias deliveryman get message: %s\n", msg);
    }
}
