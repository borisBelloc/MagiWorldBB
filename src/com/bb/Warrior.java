package com.bb;

public class Warrior extends Character {

    public Warrior(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        super(playerOwner, level, strength, agility, intelligence, life);
    }

    @Override
    void basicAttack() {

    }

    @Override
    void specialAttack() {
    }

    @Override
    String getDescription() {
        return "Woarg mon LEVEL est -> " + this.getLevel() ;
        // Todo : return formated string
//        return String.format("%03d", value);

    }


    @Override
    String getBasicAttackName() {
        return "Coup d’Épée";
    }

    @Override
    String getSpecialAttackName() {
        return "Coup de Rage";
    }

    // TODO : une methode avec la description du perso
    // "woarg je suis %class, j'ai x force, x agi..."
}
