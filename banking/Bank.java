package com.application.banking;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customer = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
    }

    public void addCustomer(Customer customer) {
        this.customer.add(new Customer(customer.getFirstName(), customer.getLastName(), customer.getAccount()));
        numberOfCustomers += 1;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return this.customer.get(index);
    }

    public String getBankName() {
        return bankName;
    }

    public void printAll() {
        if (customer.isEmpty()) {
            System.out.println("No Data Found...");
        }
        else {
            for (int i = 0; i < customer.size(); i++) {
                System.out.println("Account: " + i);
                System.out.println("First Name: " + getCustomer(i).getFirstName());
                System.out.println("Last Name: " + getCustomer(i).getLastName());
                System.out.println("Balance: $" + getCustomer(i).getAccount().getBalance());
            }
        }
    }

    public void print(int i) {
        if (customer.isEmpty()) {
            System.out.println("No Data Found...");
        }
        else {
            System.out.println("Account: " + i);
            System.out.println("First Name: " + getCustomer(i).getFirstName());
            System.out.println("Last Name: " + getCustomer(i).getLastName());
            System.out.println("Balance: $" + getCustomer(i).getAccount().getBalance());
        }
    }
}
