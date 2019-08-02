package com.bb;

public abstract class Character {
    private String playerOwner;
    private int level;
    private int strength;
    private int agility;
    private int intelligence;
    private int life;


    public Character(String playerOwner, int level, int life, int strength, int agility, int intelligence) {
        this.playerOwner = playerOwner;
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

    /**
     * Character description
     * @return w/ attributs
     */
    abstract String getDescription();

    /**
     * @return Basic attack name
     */
    abstract String getBasicAttackName();

    /**
     * @return Special attack name
     */
    abstract String getSpecialAttackName();


    // * GETTER

    public String getPlayerOwner() {
        return playerOwner;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    // * SETTER

    public void setPlayerOwner(String playerOwner) {
        this.playerOwner = playerOwner;
    }

//    TODO: del setLevel ? on ne modifie pas le lvl en jeu
    public void setLevel(int level) {
        this.level = level;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
