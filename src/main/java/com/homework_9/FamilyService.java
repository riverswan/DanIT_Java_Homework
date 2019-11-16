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
        System.out.println("----Displaying families----");
        familyDao.getAllFamilies().forEach(System.out::println);
        System.out.println("---------------------------");
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
        int randomValue = new Random().nextInt(2);
        String surname = family.getFather().getSurname();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Man boy;
        Woman girl;

        switch (randomValue) {
            case 0:
                girl = new Woman(girlName, surname, year);
                family.addChild(girl);
                break;
            case 1:
                boy = new Man(manName, surname, year);
                family.addChild(boy);
                break;

        }
        familyDao.saveFamily(family);
        return family;
    }


    Family adoptChild(Family family, Human child) {
        family.addChild(child);
        familyDao.saveFamily(family);
        System.out.println("One child was adopted");
        return family;
    }


    void deleteAllChildrenOlderThen(int age) {
        getAllFamilies().forEach(item -> {
            item.getChildren().removeIf(child -> child.getAge() > age);
            familyDao.saveFamily(item);
        });
    }


    int count() {
        return getAllFamilies().size();
    }


    Family getFamilyById(int index) {
        return getAllFamilies().get(index);
    }

    Set<Pet> getPets(int index) {
        return getFamilyById(index).getPet();
    }

    void addPet(int index, Pet pet) {
        getFamilyById(index).setPet(pet);
    }
}
