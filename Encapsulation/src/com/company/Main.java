package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 40;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemain());

        EnhancePlayer player = new EnhancePlayer("Tim", 50, "sword");
        System.out.println(player.getHealth());
    }
}
