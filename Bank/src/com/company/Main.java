package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addBranch("Sydney");

        bank.addCustomer("Adelaide", "Marija", 20.20);
        bank.addCustomer("Adelaide", "Jovan", 30.50);
        bank.addCustomer("Adelaide", "Tim", 2.70);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Mike", 4.80);

        bank.addCustomerTransaction("Adelaide", "Marija", 125.38);
        bank.addCustomerTransaction("Adelaide", "Jovan", 372.00);
        bank.addCustomerTransaction("Adelaide", "Marija", 5.20);


        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sidney", true);

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide already exist");
        }

        if (bank.addCustomerTransaction("Adelaide", "Lopov", 20.00)) {
            System.out.println("Customer does not exist");
        }


    }
}
