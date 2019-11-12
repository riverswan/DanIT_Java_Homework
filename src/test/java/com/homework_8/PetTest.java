package com.homework_8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Testing of Pet class")
public class PetTest {
    private final Dog dog = new Dog("Dog",10,75,"eat");

    @Test
    void testToStringNull() {
        assertNotEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", dog.toString(), "Test with null data");
    }


    @Test
    void testToStringData() {
        assertEquals("DOG{nickname='Dog', age=10, trickLevel=75, habits=[eat]}", dog.toString(), "Test with data");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Dog"})
    void checkForSpecies(String string) {
        assumeTrue(dog.getSpecies().name().equalsIgnoreCase(string));
    }

}