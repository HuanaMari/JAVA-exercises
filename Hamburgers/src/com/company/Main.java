package com.company;

public class Main {

    public static void main(String[] args) {
//	Hamburger hamburger = new Hamburger("Basic","sausage",3.56,"white");
////	double price = hamburger.itemizeHamburger();
//	hamburger.addHamburgerAddition("Tomato",0.27);
//	hamburger.addHamburgerAddition2("Lettuce",0.75);
//	hamburger.addHamburgerAddition3("Cheese",1.12);
//        System.out.println("Total burger price is " + hamburger.itemizeHamburger()+"$");

       HealtyBurger healthyBurger = new HealtyBurger("Bacon",2.00);
       healthyBurger.addHealthAddition("Lentils",0.85);
       healthyBurger.addHealthAddition2("Egg",2.35);
        System.out.println("Total price for Healthy Burger is " + healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.itemizeHamburger();
    }
}
