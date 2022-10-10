package com.company;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private List<Observer> observers;

    private String value;
    public Store() {
        observers = new ArrayList<Observer>();
    }

    public void registerCustomer(Observer o) {
        observers.add(o);
    }

    public void removeCustomer(Observer o) {
        observers.remove(o);
    }

    public void notifyCustomers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(String news) {
        this.value = news;
        notifyCustomers();
    }
}
