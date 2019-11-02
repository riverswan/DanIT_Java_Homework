package com.homework_6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void testToString() {
        Human human = new Human("TestName", "TestSurname", 1970);
        assertEquals("Human{name='TestName', surname='TestSurname', year=1970}", human.toString());
    }

    @Test
    @DisplayName("Test for null")
    void testNull() {
        Human human = new Human();
        assertNull(human.getFamily());
    }
}