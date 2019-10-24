package com.Homework_5;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Father", "Father surname", 1970);
        Human mother = new Human("Mother", "Mother surname", 1970);
        Pet pet = new Pet("dog", "Jack", 2, 75, "eat", "sleep");
        Human son1 = new Human("Son", "Son surname", 2000, 100);
        Human son2 = new Human("Son", "Son surname", 2000, 100);
        Human son3 = new Human("Son", "Son surname", 2000, 100);
        Human son4 = new Human("Son", "Son surname", 2000, 100);

        Family family1 = new Family(mother, father);
        family1.addChild(son);
        family1.addChild(son);
        family1.addChild(son);
        family1.addChild(son);

        family1.deleteChild(1);
        family1.deleteChild(3);
        family1.deleteChild(2);

        family1.setPet(pet);

        family1.toString();

    }
}
