package com.bb;

import java.util.Scanner;

public class Game {
    String player1Char;
    String player2Char;

    public void start() {
        System.out.println("Création du personnage du Joueur 1");
    }

    // Used to collect user's input (int)
//    public int input() {
//        Scanner sc = new Scanner(System.in);
//        return sc.nextInt();
//    }

    public int askCharacterCreation() {
        int choice = -1;
        Scanner scanChoice = new Scanner(System.in);

        while (!( choice > 0 && choice <= 3)) {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            // TODO ? Après une erreur, on vide le scanner afin de pouvoir surveiller le prochain int saisie
            //            scanChoice.next();

            // if user enter a String, tell him that's wrong
            while (!scanChoice.hasNextInt()) {
                String input = scanChoice.next();
                System.out.printf("\"%s\" Veuillez entrer un nombre entre 1 et 3.\n", input);
            }
            choice = scanChoice.nextInt();
        }
        return choice;
    }

}
