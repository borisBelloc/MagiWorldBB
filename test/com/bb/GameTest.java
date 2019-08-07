package com.bb;

import org.junit.jupiter.api.Test;

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



    // * Test Création class
//    @Test
//    public void aaaa() {
//        Game game = new Game();
//        int userChoice = 1;
//        assertEquals(false, game.askCharacterClass());
//    }






//    @Test
//    void askCharacterCreation() {
//    }
//    Game game = new Game();
//
//    @Test
//    public void Given_WrongChoice_When_UserAskedClasses_Then_AskChoiceAgain (){
//        game.askCharacterCreation();
//
//    }







}