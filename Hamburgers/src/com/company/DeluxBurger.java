package com.company;

public class DeluxBurger extends Hamburger {
    public DeluxBurger() {
        super("Delux", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddition("Chips",2.75);
        super.addHamburgerAddition2("Drink" , 1.85);
    }

    @Override
    public void addHamburgerAddition(String name, double price) {
        System.out.println("Cannot add additional items for Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items for Deluxe Burger");    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items for Deluxe Burger");    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items for Deluxe Burger");    }
}
