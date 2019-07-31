package com.bb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void userInputInt() {
//        Si l'user entre un String -> valeur attendu <copier/coller du text "n'est pas valide...">;

//        Si l'user entre un entier -> valeur attendu <la valeur entrée par l'user>
    }


    // * Test isUserInputOk
    @Test
    public void Given_Origin1AndWrongUserChoice_When_isUserInputOk_Then_DisplayCorrectProcess() {
        Game game = new Game();
        assertEquals(false, game.isUserInputOk( 1, 5));
    }    @Test
    public void Given_Origin1AndRightUserChoice_When_isUserInputOk_Then_DisplayCorrectProcess() {
        Game game = new Game();
        assertEquals(true, game.isUserInputOk( 1, 2));
    }








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