package com.bb;

public interface Classe {

    /**
     * @return Basic attack name
     */
    String getBasicAttackName();

    /**
     * @return Special attack name
     */
    String getSpecialAttackName();


    /**
     * Basic attack
     */
    public void basicAttack ();

    /**
     * Special attack
     */
    public void specialAttack ();



}
