package com.bb;

public abstract class Character {
    private int level;
    private int life;
    private int strength;
    private int agility;
    private int intelligence;

    public Character(int level, int life, int strength, int agility, int intelligence) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    /**
     * Basic attack
     */
    abstract void basicAttack();

    /**
     * Special attack
     */
    abstract void specialAttack();

    // TODO: Ajout getter ?

    /**
     * @return Basic attack name
     */
    abstract String getBasicAttackName();

    /**
     * @return Special attack name
     */
    abstract String getSpecialAttackName();



}
