package com.company.Deliveryman;

public class GlovoDeliveryman extends Deliveryman{

    public GlovoDeliveryman(int deliveryCost, double bugCapacity) {
        super(deliveryCost, bugCapacity);
    }

    @Override
    public String getDeliveryServiceName() {
        return "Glovo";
    }

    @Override
    public void notify(String msg) {
        System.out.printf("Glovo deliveryman get message: %s\n", msg);
    }
}
