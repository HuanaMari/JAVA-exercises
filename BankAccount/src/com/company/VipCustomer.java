package com.company;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer (){
        this("default",20000,"default");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"marija@gmail.com");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
