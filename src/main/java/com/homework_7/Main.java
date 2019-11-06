package com.homework_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(Species.DOG, "dog", 1, 78, "eat", "sleep");
        dog.foul();
        dog.respond();

    }
}
