package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Jacky", 8, 6, 2, 4, 1, 12, "long");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
