package com.timurradko.arena;

import java.util.Random;

public abstract class Warrior {
    Random random = new Random();
    protected String name;
    protected int attack;
    protected int health;

    public Warrior(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public Warrior(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void attack(Warrior warrior) {
        int i = random.nextInt(100);
        if (i > 70 && i < 90) {
            System.out.println("Critical attack to: " + warrior.name);
            warrior.takeDamage(attack * 5);
        } else {
            warrior.takeDamage(attack);
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }

    public String toShortString() {
        return name + " have " + health + " left hp";
    }
}

