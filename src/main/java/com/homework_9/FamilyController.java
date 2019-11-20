package com.homework_9;

import java.util.*;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int i) {
        return familyService.getFamiliesBiggerThan(i);
    }

    public List<Family> getFamiliesLessThan(int i) {
        return familyService.getFamiliesLessThan(i);
    }

    public int countFamiliesWithMemberNumber(int i) {
        return familyService.countFamiliesWithMemberNumber(i);
    }

    public Family createNewFamily(Human mother, Human father) {
        return familyService.createNewFamily(mother, father);
    }

    public void deleteFamilyByIndex(int i) {
        familyService.deleteFamilyByIndex(i);
    }

    public void deleteAllFamilies() {
        familyService.deleteAllFamilies();
    }

    public Family bornChild(Family family, String manName, String womanName) {
        return familyService.bornChild(family, manName, womanName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int i) {
        return familyService.getFamilyById(i);
    }

    Set<Pet> getPets(int i) {
        return familyService.getPets(i);
    }

    public void addPet(int i, Pet pet) {
        familyService.addPet(i, pet);
    }
}
