package com.bb;

public class Rogue extends Character {
    public Rogue(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        super(playerOwner, level, strength, agility, intelligence, life);
    }

    @Override
    int basicAttack() {
        // Damage equal to his agility
        return getAgility();
    }

    @Override
    int[] specialAttack() {
        // Gain agility as (level/2)
        int[] specialAttack = new int[1];
        specialAttack[0] = getLevel() / 2;
        return specialAttack;
    }

    @Override
    String getDescription() {
        return String.format("shhhhh je suis le Rôdeur %s niveau %d " +
                        "je possède %d de vitalité, %d de force, %d d'agilité et %d d'intelligence !",
                getPlayerOwner(), getLevel(), getLife(), getStrength(), getAgility(), getIntelligence());
    }

    @Override
    String getBasicAttackName() {
        return "Tir à l’Arc";
    }

    @Override
    String getSpecialAttackName() {
        return "Concentration";
    }
}
