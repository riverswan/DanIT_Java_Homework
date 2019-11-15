package com.homework_9;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

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
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() > amount)
                .collect(Collectors.toList());

        System.out.printf("%d families where found \n", newFamilies.size());
        return newFamilies;
    }

    List<Family> getFamiliesLessThan(int amount) {
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() < amount)
                .collect(Collectors.toList());

        System.out.printf("%d families where found \n", newFamilies.size());
        return newFamilies;
    }

    int countFamiliesWithMemberNumber(int amount) {
        List<Family> newFamilies;
        newFamilies = getAllFamilies().stream()
                .filter(family -> family.countFamily() == amount)
                .collect(Collectors.toList());

        System.out.printf("%d families where found \n", newFamilies.size());
        return newFamilies.size();

    }

    Family createNewFamily(Human mother, Human father) {
        Family family = new Family(mother, father);
        familyDao.saveFamily(family);
        return family;
    }

    void deleteFamilyByIndex(int index) {
        familyDao.deleteFamily(index);
    }

    Family bornChild(Family family, String manName, String girlName) {
        int randomValue = new Random().nextInt(1);
        String surname = family.getFather().getSurname();
        int year = new GregorianCalendar().get(Calendar.YEAR);
        Man boy;
        Woman girl;
        switch (randomValue) {
            case 0:
                girl = new Woman(girlName, surname, year);
                break;
            case 1:
                boy = new Man(manName,surname,year);

        }
        return family;
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
