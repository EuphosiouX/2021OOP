package com.application.banking;

import java.util.Locale;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
	Bank bank = new Bank("BCA");
	Customer customer = new Customer();
	Scanner scan = new Scanner(System.in);
	int choice;
	String s;

	do{
		System.out.println("Welcome to " + bank.getBankName());
		System.out.println("1) Add Customer");
		System.out.println("2) Account Details");
		System.out.println("3) Deposit");
		System.out.println("4) Withdraw");
		System.out.println("5) All Customer");
		System.out.println("6) Total Customer");
		System.out.print("Option: ");

		choice = scan.nextInt();

		switch(choice){
			case 1:
				System.out.println("First Name: ");
				String fn = scan.next();
				customer.setFirstName(fn);

				System.out.println("Last name: ");
				String ln = scan.next();
				customer.setLastName(ln);

				System.out.println("Initial Deposit: ");
				Double d = scan.nextDouble();
				customer.setAccount(new Account(d));

				bank.addCustomer(customer);
				break;

			case 2:
				System.out.println("Account Index: ");
				int i = scan.nextInt();
				bank.print(i);
				break;

			case 3:
				if(bank.getNumberOfCustomers() < 1){
					System.out.println("No Data Found...");
					break;
				}
				else {
					while (true) {
						System.out.println("Account Index: ");
						int i1 = scan.nextInt();
						System.out.println("Deposit Ammount: ");
						Double da = scan.nextDouble();
						bank.getCustomer(i1).getAccount().deposit(da);

						if (bank.getCustomer(i1).getAccount().deposit(da)) {
							System.out.println("Success, Deposited $" + da);
							break;
						} else {
							System.out.println("Deposit Ammount Can't Be 0");
						}
					}
					break;
				}

			case 4:
				if(bank.getNumberOfCustomers() < 1){
					System.out.println("No Data Found...");
					break;
				}
				else {
					while (true) {
						System.out.println("Account Index: ");
						int i2 = scan.nextInt();
						System.out.println("Withdraw Ammount: ");
						Double wa = scan.nextDouble();

						if (bank.getCustomer(i2).getAccount().withdraw(wa)) {
							System.out.println("Success, Withdrawed $" + wa);
							break;
						} else {
							System.out.println("Balance Not Sufficient");
						}
					}
					break;
				}
			case 5:
				bank.printAll();
				break;
			case 6:
				System.out.println("Total Customer: " + bank.getNumberOfCustomers());
				break;
		}
		System.out.println("Continue With Other Transaction? (y/n)");
		s = scan.next().toLowerCase();
	}while(s.equals("y"));
		System.out.println("Program Exited");
    }
}
