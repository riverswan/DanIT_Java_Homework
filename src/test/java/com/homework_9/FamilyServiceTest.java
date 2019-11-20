package com.homework_9;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FamilyServiceTest {


    Human mother1;
    Human mother2;
    Human mother3;


    Human father1;
    Human father2;
    Human father3;


    Human adoptedSon1;
    Human adoptedSon2;
    Human adoptedSon3;
    FamilyController familyController = new FamilyController();
    Family family1;
    Family family2;
    Family family3;


    @BeforeEach
    void setUp() {
        mother1 = new Woman("Woman1", "Surname1", 1970);
        mother2 = new Woman("Woman2", "Surname2", 1970);
        mother3 = new Woman("Woman3", "Surname3", 1970);
        father1 = new Man("Father1", "Surname1", 1970);
        father2 = new Man("Father2", "Surname2", 1970);
        father3 = new Man("Father3", "Surname3", 1970);
        adoptedSon1 = new Man("Adopted_1", "Surname1", 1970);
        adoptedSon2 = new Man("Adopted_2", "Surname1", 1970);
        adoptedSon3 = new Man("Adopted_3", "Surname1", 1970);
        family1 = familyController.createNewFamily(mother1, father1);
        family2 = familyController.createNewFamily(mother2, father2);
        family3 = familyController.createNewFamily(mother3, father3);
        familyController.bornChild(family1, "Boyname_Family1", "GirlName_Family1");
        familyController.bornChild(family2, "Boyname_Family2", "GirlName_Family2");
        familyController.bornChild(family3, "Boyname_Family3", "GirlName_Family3");
        familyController.adoptChild(family1, adoptedSon1);
        familyController.adoptChild(family2, adoptedSon2);
        familyController.adoptChild(family3, adoptedSon3);
        familyController.displayAllFamilies();
    }

    @AfterEach
    void tearDown() {
        familyController.deleteAllFamilies();
    }


    @Test
    void getAllFamilies() {
        assertEquals(3, familyController.getAllFamilies().size());
    }

    @Test
    void getFamiliesBiggerThan() {
        assertEquals(3, familyController.getFamiliesBiggerThan(2).size());
    }

    @Test
    void getFamiliesLessThan() {
        assertEquals(0, familyController.getFamiliesLessThan(3).size());
    }

    @Test
    void countFamiliesWithMemberNumber() {
        assertEquals(0, familyController.countFamiliesWithMemberNumber(2));
    }

    @Test
    void createNewFamily() {
        assertTrue(familyController.createNewFamily(mother1, father1) instanceof Family);
    }

    @Test
    void deleteFamilyByIndex() {
        int familiesCountBefore = familyController.getAllFamilies().size();
        familyController.deleteFamilyByIndex(2);
        assertEquals(familiesCountBefore - 1, familyController.getAllFamilies().size());
    }

    @Test
    void bornChild() {
        int sizeBefore = family1.countFamily();
        familyController.bornChild(family1, "BoyName", "GirlName");
        assertEquals(sizeBefore + 1, family1.countFamily());
    }

    @Test
    void adoptChild() {
        int sizeBefore = family1.countFamily();
        familyController.adoptChild(family1, adoptedSon1);
        assertEquals(sizeBefore + 1, family1.countFamily());
    }

    @Test
    void deleteAllChildrenOlderThen() {
        int amountBeforeDeleting = 0;
        int amountDeleted = 3;
        int amountAfterDeleting = 0;
        for (Family family : familyController.getAllFamilies()) {
            amountBeforeDeleting += family.getChildren().size();
        }

        familyController.deleteAllChildrenOlderThen(2);

        for (Family family : familyController.getAllFamilies()) {
            amountAfterDeleting += family.getChildren().size();
        }

        assertEquals(amountDeleted, amountBeforeDeleting - amountAfterDeleting);
    }

    @Test
    void count() {
        Family newFamily = familyController.createNewFamily(mother1, father3);
        assertEquals(4, familyController.getAllFamilies().size());
    }

    @Test
    void getFamilyById() {
        assertEquals(family1,familyController.getFamilyById(0));
    }

    @Test
    void getPets() {
        assertEquals(0,familyController.getPets(0).size());
    }
}