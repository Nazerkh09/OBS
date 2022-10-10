package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        Customer customer = new Customer(store);

        store.setValue("Autumn Sale is now live until November 27th");

        store.removeCustomer(customer);
    }
}
