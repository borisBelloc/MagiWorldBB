package com.bb;

public abstract class Character {
    private String playerOwner;
    private int level;
    private int strength;
    private int agility;
    private int intelligence;
    private int life;


    public Character(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        this.playerOwner = playerOwner;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.life = life;
    }


    /**
     * Basic attack
     * @return negative value if damage, positive if healing
     */
    abstract int basicAttack();

    /**
     * Special attack
     * @return negative value if damage, positive if healing
     */
    abstract int[] specialAttack();

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
