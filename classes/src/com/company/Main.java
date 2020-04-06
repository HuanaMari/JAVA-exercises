package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        holden.setModel("911");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("holden " + holden.getModel());

    }
}
