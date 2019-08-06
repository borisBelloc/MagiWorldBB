package com.bb;

public class Warrior extends Character {

    public Warrior(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        super(playerOwner, level, strength, agility, intelligence, life);
    }

    @Override
    public int basicAttack() {
        //  Effectue des dommages égaux à la force du joueur sur l’adversaire.
        return getStrength();
    }

    @Override
    public int[] specialAttack() {
        // Damage to enemy as Strength * 2 ; Damage self as Strength / 2
        int[] specialAttack = new int[2];
        // damage to enemy
        specialAttack[0] = getStrength()*2;
        // self damage
        specialAttack[1] = getStrength()/2;
        return specialAttack;
    }

    @Override
    String getDescription() {
        // float : %f ; float precision 2 : $%f.2
        // integer : %d
        // string : %s
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

}
