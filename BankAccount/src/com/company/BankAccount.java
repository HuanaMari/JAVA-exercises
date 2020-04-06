package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public  BankAccount(){
        this("5678", 0.00,"default addres","default ","default");
        System.out.println("kc's");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("New deposit of " + deposit + ".Now balance is " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw <= 0) {
            System.out.println("Only " + this.balance + " available");
        } else {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + ".Remaining balance " + this.balance);
        }
    }


}
