package com.Homework_4;

public class Main {
    public static void main(String[] args) {
        Human father = new Human("Father", "Father surname", 1970);
        Human mother = new Human("Mother", "Mother surname", 1970);
        Pet pet = new Pet("dog", "Jack", 2, 75, "eat", "sleep");
        Human son = new Human("Son", "Son surname", 2000, 100, pet, mother, father);

        son.describePet();
        son.greetPet();
        son.toString();
        pet.eat();
        pet.foul();
        pet.toString();

    }
}
