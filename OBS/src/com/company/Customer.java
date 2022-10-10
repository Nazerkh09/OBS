package com.company;

public class Customer implements Observer {

    private String value;
    private Subject store;

    public Customer(Subject store) {
        this.store = store;
        store.registerCustomer(this);
    }

    public void update(String news) {
        this.value = news;
        display();
    }

    public void display() {
        System.out.println("News: " + value);
    }
}
