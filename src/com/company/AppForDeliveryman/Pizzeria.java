package com.company.AppForDeliveryman;

public class Pizzeria extends Observable{
    @Override
    public void subscribeObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer: this.observers){
            observer.notify(msg);
        }
    }
}
