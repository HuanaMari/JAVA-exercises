package com.company;

public class Main {

    public static void main(String[] args) {

//
//	BankAccount bobsAccount = new BankAccount();
//		System.out.println(bobsAccount.getNumber());
//
//	bobsAccount.withdrawFunds(100.0);
//
//	bobsAccount.depositFunds(50.0);
//	bobsAccount.withdrawFunds(100.0);
//
//	bobsAccount.depositFunds(52.0);
//	bobsAccount.withdrawFunds(100.0);
//    }

		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());

		VipCustomer person2 = new VipCustomer("Marija",35000);
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer("Jovan",100000,"jovanSrce@damecunka.com");
		System.out.println(person3.getName() + " " +person3.getEmail());


	}
}
