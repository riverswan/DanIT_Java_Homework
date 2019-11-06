package com.homework_7;

class Fish extends Pet implements Animal {
    Fish(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    void respond() {
        System.out.println("Fish don't talk");
    }

}
