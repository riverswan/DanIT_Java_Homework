package com.homework_9;

import java.util.*;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao familyDao;

    FamilyService() {
        this.familyDao = new CollectionFamilyDao();
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(System.out::println);
    }

    List<Family> getFamiliesBiggerThan(int amount) {
        throw new NoSuchMethodError();
    }

    List<Family> getFamiliesLessThan(int amount) {
        throw new NoSuchMethodError();
    }

    List<Family> countFamiliesWithMemberNumber(int amount) {
        throw new NoSuchMethodError();
    }

    Family createNewFamily(Human mother, Human father) {
        Family family = new Family(mother, father);
        familyDao.saveFamily(family);
        return family;
    }

    void deleteFamilyByIndex(int index) {
        throw new NoSuchMethodError();
    }

    void bornChild(Family family, String name) {
        throw new NoSuchMethodError();
    }

    void adoptChild(Family family, Human child) {
        throw new NoSuchMethodError();
    }


    void deleteAllChildrenOlderThen(int age) {
        throw new NoSuchMethodError();
    }


    int count() {
        throw new NoSuchMethodError();
    }


    Family getFamilyById(int index) {
        throw new NoSuchMethodError();
    }

    Set<Pet> getPets(Family family) {
        throw new NoSuchMethodError();
    }

    void addPet(int index, Pet pet) {

    }


}
