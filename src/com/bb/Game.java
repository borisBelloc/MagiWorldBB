package com.bb;

import java.util.Scanner;

public class Game {
    String player1Char;
    String player2Char;

    public void start() {
        System.out.println("Création du personnage du Joueur 1");
    }


    public int askCharacterCreation() {
        int choice = -1;
        Scanner scanChoice = new Scanner(System.in);
//        choice = scanChoice.nextInt();

        while (!( choice > 0 && choice <= 3)) {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            // TODO ? Après une erreur, on vide le scanner afin de pouvoir surveiller le prochain int saisie
            //            scanChoice.next();
            choice = scanChoice.nextInt();
        }

            System.out.println("---->" + choice);
        return choice;
    }

}
