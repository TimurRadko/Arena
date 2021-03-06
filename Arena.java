package com.timurradko.arena;

public class Arena {
    public static void main(String[] args) throws InterruptedException {
        Warrior warrior1 = new Gladiator("Tom");
        Warrior warrior2 = new MagicianFire("MagicianFire");

        System.out.println(warrior1);
        System.out.println(warrior2);

        while (warrior1.isAlive() && warrior2.isAlive()) {
            Thread.sleep(3000);
            warrior1.attack(warrior2);
            warrior2.attack(warrior1);
            System.out.println(warrior1.toShortString());
            System.out.println(warrior2.toShortString());
        }

        if (warrior1.isAlive()) {
            System.out.println(warrior1.getName() + " is a winner");
        } else if (warrior2.isAlive()) {
            System.out.println(warrior2.getName() + " is a winner");
        } else {
            System.out.println("All died(((");
        }
    }
}
