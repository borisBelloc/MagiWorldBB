package com.bb;

public class Warrior extends Character {

    public Warrior(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    void basicAttack() {

    }

    @Override
    void specialAttack() {

    }

    @Override
    String getBasicAttackName() {
        return "Coup d’Épée";
    }

    @Override
    String getSpecialAttackName() {
        return "Coup de Rage";
    }
}
