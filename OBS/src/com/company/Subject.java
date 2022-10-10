package com.company;

public interface Subject {
    public void registerCustomer(Observer o);
    public void removeCustomer(Observer o);
    public void notifyCustomers();
}