package com.company.Deliveryman;

import com.company.AppForDeliveryman.Observer;
import com.company.Food.IOrderedFood;

import java.util.ArrayList;
import java.util.List;

public abstract class Deliveryman implements Observer {

    private final int deliveryCost;
    private List<IOrderedFood> bug;
    private final double bugCapacity;

    public Deliveryman(int deliveryCost, double bugCapacity){
        this.deliveryCost = deliveryCost;
        this.bugCapacity = bugCapacity;
        this.bug = new ArrayList<>();
    }

    public int getDeliveryCost() {
        return deliveryCost;
    }

    public List<IOrderedFood> getBug() {
        return bug;
    }

    public void addOrderToBug(IOrderedFood orderedFood) {
        this.bug.add(orderedFood);
    }

    public double getBugWeight(){
        double weight = 0;
        for(IOrderedFood orderedFood: bug){
            weight += orderedFood.getWeight();
        }
        return weight;
    }

    public double getBugCapacity() {
        return bugCapacity;
    }

    public boolean isPossibleToAddNewOrder(IOrderedFood orderedFood){
        return (this.getBugWeight() + orderedFood.getWeight()) < getBugCapacity();
    }

    public abstract String getDeliveryServiceName();
}
