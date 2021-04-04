package com.application.banking;

import java.util.Arrays;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customer = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        this.customer.add(new Customer(f, l));
        numberOfCustomers += 1;
    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customer.get(index);
    }

}
