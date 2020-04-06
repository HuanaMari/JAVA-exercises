package com.company;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int cylinder;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.engine = true;
        this.wheels = 4;

    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void startEngine() {
        System.out.println("engine is started");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }

    public void brake() {
        System.out.println("brake");
    }
}

 class Beetle extends Car{
    public Beetle() {
        super("Beetle", 4);
    }

      public void startEngine() {
          System.out.println("Beetle is ready");
     }
 }

 class BMW extends Car{
     public BMW() {
         super("BMW", 8);
     }

     @Override
     public void accelerate() {
         super.accelerate();
     }
 }

 class Audi extends Car{
     public Audi() {
         super("Audi", 6);
     }

     @Override
     public void brake() {
         System.out.println("Audi brakes");
     }
 }

public class Main {

    public static void main(String[] args) {
        Beetle beetle = new Beetle();
        BMW bmw = new BMW();
        Audi audi = new Audi();

        beetle.startEngine();
        bmw.accelerate();
        audi.brake();
    }
}
