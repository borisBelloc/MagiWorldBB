package com.bb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    public void Given_CharactersAttributs_When_WarriorCreated_Then_DisplayCorrectDescription() {
        Game game = new Game();
        Character character = new Warrior(
        "Test", 10, 5, 4, 1, 50);
        String expectedDescription = "Woarg je suis le Guerrier Test niveau 10 " +
                "je possède 50 de vitalité, 5 de force, 4 d'agilité et 1 d'intelligence !";
        assertEquals(expectedDescription, character.getDescription());
    }
}