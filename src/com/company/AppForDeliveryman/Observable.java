package com.company.AppForDeliveryman;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers;

    public  Observable(){
        this.observers = new ArrayList<>();
    }

    public abstract void subscribeObserver(Observer observer);

    public abstract void notifyObservers(String msg);
}
