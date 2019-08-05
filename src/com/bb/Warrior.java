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
        // float : %f ; float precision 2 : $%f.2
        // integer : %d
        // string : %s
//        return "Woarg je suis le Guerrier mon LEVEL est -> " + this.getLevel() ;
        // Todo : return formated string
        return String.format("Woarg je suis le Guerrier %s niveau %d " +
                "je possède %d de vitalité, %d de force, %d d'agilité et %d d'intelligence !",
                getPlayerOwner(), getLevel(), getLife(), getStrength(), getAgility(), getIntelligence() );

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
