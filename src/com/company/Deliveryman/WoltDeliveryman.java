package com.company.Deliveryman;

public class WoltDeliveryman extends Deliveryman{


    public WoltDeliveryman(int deliveryCost, double bugCapacity) {
        super(deliveryCost, bugCapacity);
    }

    @Override
    public String getDeliveryServiceName() {
        return "Wolt";
    }

    @Override
    public void notify(String msg) {
        System.out.printf("Wolt deliveryman get message: %s\n", msg);
    }
}
