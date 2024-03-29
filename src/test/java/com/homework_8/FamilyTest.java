package com.homework_8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTest {
    private static Family family;
    private static Human mother;
    private static Human father;
    private static Human son1;
    private static Human son2;
    private static Human son3;
    private static Human son4;

    @BeforeAll
    static void setFamily() {
        father = new Human("Father", "Father surname", 1970);
        mother = new Human("Mother", "Mother surname", 1970);
        son1 = new Human("Son1", "Son surname", 2000);
        son2 = new Human("Son2", "Son surname", 2000);
        son3 = new Human("Son4", "Son surname", 2000);
        son4 = new Human("Son3", "Son surname", 2000);
        family = new Family(mother, father);
        family.addChild(son1);
        family.addChild(son2);
        family.addChild(son3);
    }

    @Test
    void deleteChild() {
        assertEquals(4, family.getChildren().size());
        family.deleteChild(1);
        assertEquals(3, family.getChildren().size());
    }

    @Test
    void deleteChildOutOfBounds() {
        assertEquals(family.deleteChild(10).size(), family.getChildren().size());
    }


    @Test
    void addChild() {
        int previOusLength = family.getChildren().size();
        family.addChild(son4);
        assertEquals(previOusLength + 1, family.getChildren().size());
    }

    @Test
    void countFamily() {
        assertEquals(5, family.countFamily());
    }
}