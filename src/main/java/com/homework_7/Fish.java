package com.homework_7;

public class Fish extends Pet implements Animal {
    Fish(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void respond() {
        System.out.println("Fish don't talk");
    }

}
