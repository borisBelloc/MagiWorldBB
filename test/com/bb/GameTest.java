package com.bb;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    // * Test isUserInputOk
    // origin 1
    @Test
    public void Given_Origin1AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(false, game.isUserInputOk( 1, 5));
    }
    @Test
    public void Given_Origin1AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBools() {
        Game game = new Game();
        assertEquals(true, game.isUserInputOk( 1, 2));
    }
    // origin 20
    @Test
    public void Given_Origin20AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(false, game.isUserInputOk( 20, 0));
    }
    @Test
    public void Given_Origin20AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(true, game.isUserInputOk( 20, 75));
    }
    // origin 21
    @Test
    public void Given_Origin21AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(false, game.isUserInputOk( 21, 110));
    }
    @Test
    public void Given_Origin21AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(true, game.isUserInputOk( 21, 75));
    }
    // origin 3
    @Test
    public void Given_Origin3AndWrongUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(false, game.isUserInputOk( 3, 3));
    }
    @Test
    public void Given_Origin3AndRightUserChoice_When_isUserInputOk_Then_ReturnCorrectBool() {
        Game game = new Game();
        assertEquals(true, game.isUserInputOk( 3, 1));
    }

    // * Test characterCreation

    @Test
    public void Given_GoodRequirementToCreateCharacter_When_characterCreation_Then_addCharacterTocharactersList() {
        Game game = new Game();
        // characterAttributes [ level, strength, agility, intelligence, life ]
        int[] characterAttributes = {5, 5, 0, 0, 25};
        game.characterCreation("Guerrier", characterAttributes, "playerTest");
        assertEquals(1, game.charactersList.size());
    }
    @Test
    public void Given_WrongRequirementToCreateCharacter_When_characterCreation_Then_dontCreateCharacter() {
        Game game = new Game();
        // characterAttributes [ level, strength, agility, intelligence, life ]
        int[] characterAttributes = {5, 5, 0, 0, 25};
        game.characterCreation("wrongClassName", characterAttributes, "playerTest");
        assertEquals(0, game.charactersList.size());
    }


}