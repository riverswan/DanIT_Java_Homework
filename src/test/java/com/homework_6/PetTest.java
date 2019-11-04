package com.homework_6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Testing of Pet class")
public class PetTest {
    private final Pet petEmpty = new Pet();

    @Test
    @Order(1)
    void testToStringNull() {
        assertEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", petEmpty.toString(), "Test with null data");
    }


    @RepeatedTest(value = 3, name = "{displayName} order is: {currentRepetition}/{totalRepetitions}")
    @Order(2)
    @Test
    void testToStringData() {
        Pet petWithData = new Pet(Species.DOG, "PetTest", 10, 75, "eat", "sleep");
        assertEquals("DOG{nickname='PetTest', age=10, trickLevel=75, habits=[eat, sleep]}", petWithData.toString(), "Test with data");
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {"Dog"})
    void checkForSpecies(String string) {
        assumeTrue(new Pet(Species.DOG, "Pet").getSpecies().name().equalsIgnoreCase(string));
    }

    @Test
    void checkSpeciesForNull() {
        assertNull(new Pet().getSpecies());
    }
}