package com.application.banking;

public class Driver {

    public static void main(String[] args) {
	Account a1 = new Account(3500000);
	Account a2 = new Account(4000000);
	Account a3 = new Account(6942000);
	Bank b1 = new Bank("Mandiri");


	b1.addCustomer("Michael", "Christopher");
	b1.addCustomer("Jude", "Martinez");
	b1.addCustomer("Rick", "Astley");

	b1.getCustomer(0).setAccount(a1);
	b1.getCustomer(1).setAccount(a2);
	b1.getCustomer(2).setAccount(a3);
	System.out.printf("Number of customer is: %s\n", b1.getNumberOfCustomers());

	System.out.println(b1.getCustomer(0).getFirstName());
	System.out.println(b1.getCustomer(0).getAccount().getBalance());

	System.out.println(b1.getCustomer(1).getFirstName());
	b1.getCustomer(1).getAccount().deposit(550000);
	System.out.println(b1.getCustomer(1).getAccount().getBalance());

	System.out.println(b1.getCustomer(2).getFirstName());
	b1.getCustomer(2).getAccount().withdraw(550000);
	System.out.println(b1.getCustomer(2).getAccount().getBalance());
    }
}
