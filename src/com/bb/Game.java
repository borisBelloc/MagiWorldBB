package com.bb;

import java.util.*;

//import com.google.common.collect.ImmutableMap;


public class Game {
    // liste des noms des joueurs
    public String[] playersList = {"Joueur 1", "Joueur 2"};
    // stock les personnages créés
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

            // askClass : transform the int into String 'class name')
            // todo : a t'on vraiment besoin d'un string ?
            String chosenClass = classesList.get(askCharacterClass());

            // Character creation
            // characterCreation(chosenClass + characterAttributes[] + player name)
            characterCreation(chosenClass, askCharacterAttributes(), playersList[i] );
            // askAttribute

            // print attributes array
//            System.out.println(Arrays.toString(askCharacterAttributes()));


            // createCharacter


            // initialise la class choisis
//            characterCreation(classesList.get(askCharacterClasses()), playersList[i]);
//            System.out.println("Hero created");
//            askCharacterAttributes();

            System.out.println("charactersList AFTER ------> " + charactersList);
//            System.out.println(" AFTER -----> ----->" + Arrays.toString(charactersList.toArray()));


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
                if (1 <= userChoice && userChoice <= 100) {
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

    /**
     * Return choosen class as int
     *
     * @return 1 == "Guerrier" | 2 == "Rôdeur" | 3 == "Mage"
     */
    public int askCharacterClass() {
        int userChoice;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        }
        while (!isUserInputOk(1, userChoice = userInputInt()));
        return userChoice;
    }

    /**
     * return an array int[] with the character attributes
     * @return [ level, strength, agility, intelligence, life ]
     */
    public int[] askCharacterAttributes() {
        String[] attributesList = {"Niveau", "Force", "Agilité", "Intelligence"};
        int[] characterAttributes = new int[5];
        boolean areAttributesOk = false;

        while (!areAttributesOk) {
            for (int i = 0; i < attributesList.length; i++) {
                do {
                    System.out.printf("%s du personnage ?\n", attributesList[i]);
                }
                while (!isUserInputOk(20, characterAttributes[i] = userInputInt()));
            }
            if ((characterAttributes[1] + characterAttributes[2] + characterAttributes[3]) == characterAttributes[0]) {
                areAttributesOk = true;
            } else { System.out.println(
                        "La saisie n'est pas valide ! La valeur des attributs doit être égal au niveau du joueur\n" +
                        "(Règle : force + agilité + intelligence = niveau joueur).\n"
            );}
            // calculating life attribute : life = level * 5
            characterAttributes[4] = characterAttributes[0] * 5;
        }
        return characterAttributes;
    }


    /**
     *
     * @param chosenClass
     *          1 : warrior
     *          2 : rogue
     *          3 : wizard
     * @param characterAttributes
     *          [ level, strength, agility, intelligence, life ]
     * @param playerOwner player name
     */
    public void characterCreation(String chosenClass, int[] characterAttributes, String playerOwner) {

        switch (chosenClass) {
            case "Guerrier":
                System.out.println("IL A CHOISIS Guerrier");
//                Product cafe = new Product("Philips", "Senseo Noir", 79.99);
//                Character test1 = new Warrior(1,);
                charactersList.add(new Warrior(
                        playerOwner, characterAttributes[0], characterAttributes[1], characterAttributes[2],
                        characterAttributes[3], characterAttributes[4]
                ));


//            case 2:
//                break;
//            case 3:
//                break;

        }

    }


}
