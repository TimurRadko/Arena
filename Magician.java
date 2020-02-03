package com.timurradko.arena;

public abstract class Magician extends Warrior {
    protected int macicAttack;
    protected int mana;
    protected int cooldown;

    public Magician(String name, int attack, int health, int magicAttack, int mana, int cooldown) {
        super(name, attack, health);
        this.macicAttack = magicAttack;
        this.mana = mana;
        this.cooldown = cooldown;
    }

    @Override
    public String toString() {
        return "MagicianFire{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", magic attack=" + macicAttack +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }

}
