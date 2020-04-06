package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branche> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branche>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branche(branchName));
            System.out.println("New branch added " + branchName);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double InitialAmount) {
        Branche branche = findBranch(branchName);
        if (branche != null) {
            return branche.newCustomer(customerName, InitialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branche branche = findBranch(branchName);
        if (branche != null) {
            return branche.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public Branche findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branche checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branche branche = findBranch(branchName);
        if (branche != null) {
            System.out.println("Customers details for branch " + branche.getName());

            ArrayList<Customer> branchCustomers = branche.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
