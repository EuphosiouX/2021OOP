package com.application.banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(){
        this.firstName = "";
        this.lastName = "";
    }

    public Customer(String f, String l, Account account){
        this.firstName = f;
        this.lastName = l;
        setAccount(account);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }
}
