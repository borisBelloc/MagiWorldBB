package com.bb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RogueTest {
    Game game = new Game();

    @Test
    public void Given_CharactersAttributs_When_RogueCreated_Then_DisplayCorrectDescription() {
        Character character = new Rogue(
                "Test", 10, 1, 7, 2, 50);
        String expectedDescription = "shhhhh je suis le Rôdeur Test niveau 10 " +
                "je possède 50 de vitalité, 1 de force, 7 d'agilité et 2 d'intelligence !";
        assertEquals(expectedDescription, character.getDescription());
    }

    @Test
    public void Given_2Character_When_currentPlayerBasicAttackEnemy_Then_getTheRightHeal() {
        int[] characterAttributes = {5, 0, 10, 0, 10};
        game.characterCreation("Rôdeur", characterAttributes, "player1");
        game.characterCreation("Rôdeur", characterAttributes, "player2");
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
        int[] characterAttributes = {6, 0, 5, 0, 25};
        System.setIn(new ByteArrayInputStream("2".getBytes()));
        game.characterCreation("Rôdeur", characterAttributes, "player1");
        game.characterCreation("Rôdeur", characterAttributes, "player2");
        game.charactersList.get(0).specialAttackLog(game.charactersList.get(0), game.charactersList.get(1));
        String output = outContent.toString().replace("\r\n", "\n").split("\n")[0];
        assertEquals("player1 utilise Concentration et gagne 3 en agilité.", output);
        game.charactersList.get(0).specialAttack();
        game.charactersList.get(0).setAgility(game.charactersList.get(0).getAgility()+game.charactersList.get(0).specialAttack()[0]);
        assertEquals(8, game.charactersList.get(0).getAgility());
    }



}