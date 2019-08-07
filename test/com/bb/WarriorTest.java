package com.bb;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
        Game game = new Game();

    @Test
    public void Given_CharactersAttributs_When_WarriorCreated_Then_DisplayCorrectDescription() {
        Character character = new Warrior(
        "Test", 10, 5, 4, 1, 50);
        String expectedDescription = "Woarg je suis le Guerrier Test niveau 10 " +
                "je possède 50 de vitalité, 5 de force, 4 d'agilité et 1 d'intelligence !";
        assertEquals(expectedDescription, character.getDescription());
    }

    @Test
    public void Given_2Character_When_currentPlayerBasicAttackEnemy_Then_getTheRightHeal() {
        int[] characterAttributes = {2, 10, 0, 0, 10};
        game.characterCreation("Guerrier", characterAttributes, "player1");
        game.characterCreation("Guerrier", characterAttributes, "player2");
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        game.fight(game.charactersList);
        assertEquals(0 , game.charactersList.get(1).getLife());
    }

    @Test
    public void Given_2Character_When_currentPlayerSpecialttackEnemy_Then_getTheRightHeal() {
        int[] characterAttributes = {4, 10, 0, 0, 20};
        game.characterCreation("Guerrier", characterAttributes, "player1");
        game.characterCreation("Guerrier", characterAttributes, "player2");
        System.setIn(new ByteArrayInputStream("2".getBytes()));
        game.fight(game.charactersList);
        assertEquals(15 , game.charactersList.get(0).getLife());
        assertEquals(0 , game.charactersList.get(1).getLife());
    }

}