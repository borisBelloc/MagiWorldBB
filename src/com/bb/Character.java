package com.bb;

public abstract class Character {
    private String playerOwner;
    private int level;
    private int strength;
    private int agility;
    private int intelligence;
    private int life;
    private int maxLife;

    public Character(String playerOwner, int level, int strength, int agility, int intelligence, int life) {
        this.playerOwner = playerOwner;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.life = life;
        this.maxLife = life;
    }


    /**
     * Basic attack
     *
     * @return
     */
    abstract int basicAttack();

    public void basicAttackLog(Character currentPlayer, Character enemy) {
        System.out.printf("%s utilise %s et inflige %d dommages.\n",
                currentPlayer.getPlayerOwner(), currentPlayer.getBasicAttackName(), currentPlayer.basicAttack());
        System.out.printf("%s perd %d points de vie\n",
                enemy.getPlayerOwner(), currentPlayer.basicAttack());
    }


    /**
     * Special attack
     *
     * @return
     */
    abstract int[] specialAttack();

    abstract void specialAttackLog(Character currentPlayer, Character enemy);

    /**
     * Character description
     *
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

    public int getMaxLife() {
        return maxLife;
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
