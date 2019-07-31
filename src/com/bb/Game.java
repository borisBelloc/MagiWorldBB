package com.bb;

import java.util.Scanner;

public class Game {
    String player1Char;
    String player2Char;


    // ----------------------
    //    Imprim text
    // ----------------------
    public void start() {
        System.out.println("Création du personnage du Joueur 1");
    }


    /**
     * Used to collect user's input and check if it's an int
     * @return user choice as int
     */
    public int userInputInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            String input = sc.next();
            System.out.printf("\"%s\" n'est pas valide ! Veuillez entrer un nombre entier.\n", input);
        }
        return sc.nextInt();
    }


    /**
     * Check if the user input is in the allowed choice range
     * @param userChoice
     * @param origin
        // origin (allowed value):
        // 1 : askCharacterCreation : 0 < x <= 3
        // 2 : attributs selection : x < level
        // 3 : combat selection ? : 1 || 2
     * @return boolean
     */
    public boolean isUserInputOk(int origin, int userChoice) {
        switch (origin) {
            case 1:
                if (userChoice > 0 && userChoice <= 3) {
                    return true;
                } else {
                    return false;
                }
//            case 2:
//                break;
//            case 3:
//                break;
        }
//        TODO: voir ce return à fix
        return false;
    }

    public int askCharacterCreation() {
        int userChoice;

        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        }
        while (!isUserInputOk(1, userChoice = userInputInt() ));

        System.out.println("USER CHOICE ->> " + userChoice );
        return userChoice;
    }

}
