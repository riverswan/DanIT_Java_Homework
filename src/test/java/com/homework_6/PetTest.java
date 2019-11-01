package com.homework_6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Testing of Pet class")
class PetTest {
    private final Pet petEmpty = new Pet();

    @Test
    void testToStringNull() {
        assertEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", petEmpty.toString(), "Test with null data");
    }


    @Test
    void testToStringData() {
        Pet petWithData = new Pet(Species.DOG, "PetTest", 10, 75, "eat", "sleep");
        assertEquals("DOG{nickname='PetTest', age=10, trickLevel=75, habits=[eat, sleep]}", petWithData.toString(), "Test with data");
    }
}