package com.bb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game = new Game();

    // * Test isUserInputOk
    @Test
    public void Given_Origin1AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(false, game.isUserInputOk(1, 5));
    }

    @Test
    public void Given_Origin1AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBools() {
        assertEquals(true, game.isUserInputOk(1, 2));
    }

    @Test
    public void Given_Origin20AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(false, game.isUserInputOk(20, 0));
    }

    @Test
    public void Given_Origin20AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(true, game.isUserInputOk(20, 75));
    }

    @Test
    public void Given_Origin21AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(false, game.isUserInputOk(21, 110));
    }

    @Test
    public void Given_Origin21AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(true, game.isUserInputOk(21, 75));
    }

    @Test
    public void Given_Origin3AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(false, game.isUserInputOk(3, 3));
    }

    @Test
    public void Given_Origin3AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        assertEquals(true, game.isUserInputOk(3, 1));
    }

    // * Test characterCreation

    @Test
    public void Given_GoodRequirementToCreateCharacter_When_characterCreation_Then_addCharacterTocharactersList() {
        // characterAttributes [ level, strength, agility, intelligence, life ]
        int[] characterAttributes = {5, 5, 0, 0, 25};
        game.characterCreation("Guerrier", characterAttributes, "playerTest");
        assertEquals(1, game.charactersList.size());
    }

    @Test
    public void Given_WrongRequirementToCreateCharacter_When_characterCreation_Then_dontCreateCharacter() {
        // characterAttributes [ level, strength, agility, intelligence, life ]
        int[] characterAttributes = {5, 5, 0, 0, 25};
        game.characterCreation("wrongClassName", characterAttributes, "playerTest");
        assertEquals(0, game.charactersList.size());
    }

    // * Test whoLost
    @Test
    public void Given_2CharactersWithoutHeal_When_UsingWhoLost_then_returnMessageBothDied() {
        int[] characterAttributes = {5, 5, 0, 0, 0};
        game.characterCreation("Guerrier", characterAttributes, "player1");
        game.characterCreation("Guerrier", characterAttributes, "player2");
        assertEquals("Tout le monde", game.whoLost(game.charactersList));
    }

    @Test
    public void Given_1CharactersWithoutHeal_When_UsingWhoLost_then_returnPlayer2Died() {
        int[] character1Attributes = {5, 5, 0, 0, 25};
        int[] character2Attributes = {5, 5, 0, 0, 0};
        game.characterCreation("Guerrier", character1Attributes, "player1");
        game.characterCreation("Guerrier", character2Attributes, "player2");
        assertEquals("player2", game.whoLost(game.charactersList));
    }

    @Test
    public void Given_1CharactersWithoutHeal_When_UsingWhoLost_then_returnPlayer1Died() {
        int[] character1Attributes = {5, 5, 0, 0, 0};
        int[] character2Attributes = {5, 5, 0, 0, 30};
        game.characterCreation("Guerrier", character1Attributes, "player1");
        game.characterCreation("Guerrier", character2Attributes, "player2");
        assertEquals("player1", game.whoLost(game.charactersList));
    }

    // Test with fake input

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

    // askCharacterClass()
    @Test
    public void Given_input1_When_askingUserCharacterClass_then_acceptTheInput() {
        // fake input by user
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        assertEquals(1, game.askCharacterClass());
    }

    // this test check if the class is created, if it is then the test failled
    @Test
    public void Given_inputOutOfrange_When_askingUserCharacterClass_then_Error() {
        System.setIn(new ByteArrayInputStream("5".getBytes()));
        try {
            game.askCharacterClass();
            fail();
        } catch (java.util.NoSuchElementException e) {
            // succeed();
        }

    }

}