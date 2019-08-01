package com.bb;

import java.util.*;

//import com.google.common.collect.ImmutableMap;


public class Game {
    public String[] playersList = {"Joueur 1", "Joueur 2"};
    List<Character> charactersList = new ArrayList<Character>();


    // DOC : https://guava.dev/releases/snapshot/api/docs/com/google/common/collect/ImmutableMap.html
    // DOC : https://www.geeksforgeeks.org/immutable-map-in-java/
    // DOC : https://stackoverflow.com/a/6802502/9552861
    Map<Integer, String> classesList = Map.of(
            1, "Guerrier",
            2, "Rôdeur",
            3, "Mage");


    public void start() {
        // stock les personnages créés

        for (int i = 0; i < playersList.length; i++) {
            // %n : saut de ligne
            System.out.printf("Création du personnage du %s%n", playersList[i]);

            // return le nom de la class choisi :: "Guerrier", "Rôdeur", "Mage"
//            classesList.get(askCharacterCreation());


            // initialise la class choisis
            characterCreation(classesList.get(askCharacterCreation()), playersList[i]);
            System.out.println("Hero created");
            askCharacterAttributes();

            System.out.println("charactersList AFTER ------> " + charactersList);
            System.out.println(" AFTER -----> ----->" + Arrays.toString(charactersList.toArray()));

            // print les propriétaire des perso
//            System.out.println("AA" + charactersList.get(0).getPlayerOwner());

//            for(int j = 0; j < charactersList.size(); j++) {
////                System.out.println(playersList[charactersList.get(j).getPlayerOwner()]);
//                System.out.println( charactersList.get(j).getPlayerOwner());
//                //playersList[i]
//            }

            System.out.println("Creation des heros terminés");

        }
    }


    /**
     * Used to collect user's input and check if it's an int
     *
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
     *
     * @param origin     // origin (allowed value):
     *                   // 1 : askCharacterCreation() : 0 < x <= 3
     *                   // 20 : is attribute value ok : 1 <= x <= 100
     *                   // 21 : askCharacterAttributes() : x < level
     *                   // 3 : combat selection ? : 1 || 2
     * @param userChoice : input entered by the user
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
            case 20:
                if ( 1 <= userChoice && userChoice <= 100 ) {
                    return true;
                } else {
                    return false;
                }
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

    public void askCharacterAttributes() {
        // was int
// Vie : égale au niveau du joueur * 5

        int charLevel;

        do {
            System.out.println("Niveau du personnage ?");
        }
        while (!isUserInputOk(20, charLevel = userInputInt()));

//TODO : refaire le do while pour chaque attributs

        System.out.println("Force du personnage ?");
        int charStrength = userInputInt();
        System.out.println("Agilité du personnage ?");
        int charAgility = userInputInt();
        System.out.println("Intelligence du personnage ?");
        int charIntelligence = userInputInt();

        //    private int level;
        //    private int life;
        //    private int strength;
        //    private int agility;
        //    private int intelligence;

    }

    public void characterCreation(String userChoice, String playerOwner) {
        // DOC : you actually don't need to include <String, String> the second time.
        // You can just do Map<String, String> map = new HashMap<>()
        // DOC : Map <K, V>
//        Map<Integer, String> map =

        switch (userChoice) {
            case "Guerrier":
                System.out.println("IL A CHOISIS Guerrier");
//                Product cafe = new Product("Philips", "Senseo Noir", 79.99);
//                Character test1 = new Warrior(1,);
                charactersList.add(new Warrior(playerOwner, 2, 3, 4, 5, 6));


//            case 2:
//                break;
//            case 3:
//                break;

        }

    }


}
