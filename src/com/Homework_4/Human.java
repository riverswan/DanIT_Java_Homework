package com.Homework_4;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    Human() {
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        pet = null;
        mother = null;
        father = null;
        schedule = new String[0][];
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public void greetPet() {
        System.out.printf("Привет, %s \n", pet.nickname);
    }

    public void describePet() {
        String trickLevel = pet.trickLevel > 50 ? "очень хитрый" : "почти не хитрый";
        System.out.printf("У меня есть %s, ему %d лет, он %s \n", pet.species, pet.age, trickLevel);
    }

    @Override
    public String toString() {
        String info = String.format("Human{name='%s', surname='%s', year=%d, mother=%s %s, father = %s %s pet=%s}",
                name, surname, year, mother.name, mother.surname, father.name, father.surname, pet.toString());
        System.out.println(info);
        return info;
    }
}
