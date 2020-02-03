package com.timurradko.arena;

public class MagicianFire extends Magician {

    public MagicianFire(String name) {
        super(name, 3, 95, 120, 20, 0);
    }

    @Override
    public void attack(Warrior warrior) {
        if (cooldown == 0) {
            warrior.takeDamage(macicAttack);
            mana -= 4;
            cooldown = 3;
        } else {
            warrior.takeDamage(attack);
            cooldown--;
        }
    }
}
