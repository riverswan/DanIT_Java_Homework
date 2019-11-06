package com.homework_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 1, 78, "eat", "sleep");
        dog.foul();
        dog.respond();


        RoboCat roboCat = new RoboCat("RoboCat", 1, 78, "eat", "sleep");
        roboCat.foul();
        roboCat.respond();

        Fish fish = new Fish("fish", 1, 78, "eat", "sleep");
        fish.foul();
        fish.respond();

        DomesticCat domesticCat = new DomesticCat("DomesticCat", 1, 78, "eat", "sleep");
        domesticCat.foul();
        domesticCat.respond();

    }
}
