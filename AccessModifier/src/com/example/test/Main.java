package com.example.test;

public class Main {

    public static void main(String[] args) {
	Account myAccount = new Account("Marija");
	myAccount.deposit(500);
	myAccount.withdraw(200);
	myAccount.deposit(-200);
	myAccount.withdraw(-50);
	myAccount.calculateBalance();

        System.out.println("Balance on account is  " + myAccount.getBalance());
    }
}
