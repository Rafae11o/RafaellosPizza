package com.company.Deliveryman;

public class ChocofoodDeliveryman extends Deliveryman {


    public ChocofoodDeliveryman(int deliveryCost, double bugCapacity) {
        super(deliveryCost, bugCapacity);
    }

    @Override
    public String getDeliveryServiceName() {
        return "Chocofood";
    }

    @Override
    public void notify(String msg) {
        System.out.printf("Chocofood deliveryman get message: %s\n", msg);
    }
}
