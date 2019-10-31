package com.homework_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    private final Pet petEmpty = new Pet();
    private final Pet petWithData = new Pet(Species.DOG, "PetTest", 10, 75, "eat", "sleep");

    @Test
    void testToStringNull() {
        assertEquals("null{nickname='', age=-1, trickLevel=-1, habits=[]}", petEmpty.toString(), "Test with null data");
    }

    @Test
    void testToStringData() {
        assertEquals("DOG{nickname='PetTest', age=10, trickLevel=75, habits=[eat, sleep]}", petWithData.toString(), "Test with data");
    }

}