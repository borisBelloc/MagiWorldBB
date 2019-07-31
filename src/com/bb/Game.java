package com.bb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import com.google.common.collect.ImmutableMap;


public class Game {
    public String[] playersList = {"Joueur 1", "Joueur 2"};
    // DOC : https://guava.dev/releases/snapshot/api/docs/com/google/common/collect/ImmutableMap.html
    // DOC : https://www.geeksforgeeks.org/immutable-map-in-java/
    // DOC : https://stackoverflow.com/a/6802502/9552861
    Map<Integer, String> classesList = Map.of(
            1, "Guerrier",
            2, "Rôdeur",
            3, "Mage");

    // Let's print the set
//        System.out.println(map);


    public void start() {

        for (int i = 0; i < playersList.length; i++) {
            // %n : saut de ligne
            System.out.printf("Création du personnage du %s%n", playersList[i]);

            // return le nom de la class choisi
            classesList.get(askCharacterCreation());

            // initialise la class choisis
            // ask attributs

        }
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
     * @param origin     // origin (allowed value):
     *                   // 1 : askCharacterCreation : 0 < x <= 3
     *                   // 2 : attributs selection : x < level
     *                   // 3 : combat selection ? : 1 || 2
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
        while (!isUserInputOk(1, userChoice = userInputInt()));
        return userChoice;
    }

//    public String characterCreation() {
    // DOC : you actually don't need to include <String, String> the second time.
    // You can just do Map<String, String> map = new HashMap<>()
    // DOC : Map <K, V>
//        Map<Integer, String> map = new HashMap<>();


//    }


}
