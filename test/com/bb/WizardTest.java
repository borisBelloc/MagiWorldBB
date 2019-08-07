package com.bb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    Game game = new Game();

    @Test
    public void Given_CharactersAttributs_When_WizardCreated_Then_DisplayCorrectDescription() {
        Character character = new Wizard(
                "Test", 10, 1, 4, 5, 50);
        String expectedDescription = "Abracadabra je suis le Mage Test niveau 10 " +
                "je possède 50 de vitalité, 1 de force, 4 d'agilité et 5 d'intelligence !";
        assertEquals(expectedDescription, character.getDescription());
    }

    @Test
    public void Given_2Character_When_currentPlayerBasicAttackEnemy_Then_getTheRightHeal() {
        int[] characterAttributes = {2, 0, 0, 10, 10};
        game.characterCreation("Mage", characterAttributes, "player1");
        game.characterCreation("Mage", characterAttributes, "player2");
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        game.fight(game.charactersList);
        assertEquals(0, game.charactersList.get(1).getLife());
    }

    // récupere la valeur dans le terminal
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void Given_2Character_When_currentPlayerSpecialttackEnemy_Then_getTheRightHeal() {
        int[] characterAttributes = {5, 0, 0, 5, 25};
        System.setIn(new ByteArrayInputStream("2".getBytes()));
        game.characterCreation("Mage", characterAttributes, "player1");
        game.characterCreation("Mage", characterAttributes, "player2");
        game.charactersList.get(0).specialAttackLog(game.charactersList.get(0), game.charactersList.get(1));
        String output = outContent.toString().replace("\r\n", "\n").split("\n")[0];
        assertEquals("player1 utilise Soin et gagne 10 en vitalité.", output);
        game.charactersList.get(0).specialAttack();
        game.charactersList.get(0).setLife(game.charactersList.get(0).getLife()+game.charactersList.get(0).specialAttack()[0]);
        assertEquals(35, game.charactersList.get(0).getLife());
    }

}