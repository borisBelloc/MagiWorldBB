package com.bb;

public class Wizard extends Character {

    public Wizard(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        super(playerOwner, level, strength, agility, intelligence, life);
    }

    @Override
    int basicAttack() {
        // Damage equal to his intelligence
        return getIntelligence();
    }

    @Override
    int[] specialAttack() {
        // Heal himself for (intelligence * 2)
        int[] specialAttack = new int[1];
        specialAttack[0] = getIntelligence() * 2;
        return specialAttack;
    }

    @Override
    String getDescription() {
        return String.format("Abracadabra je suis le Mage %s niveau %d " +
                        "je possède %d de vitalité, %d de force, %d d'agilité et %d d'intelligence !",
                getPlayerOwner(), getLevel(), getLife(), getStrength(), getAgility(), getIntelligence());
    }


    @Override
    String getBasicAttackName() {
        return "Boule de Feu";
    }

    @Override
    String getSpecialAttackName() {
        return "Soin";
    }
}
