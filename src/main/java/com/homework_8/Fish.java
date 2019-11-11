package com.homework_8;

class Fish extends Pet implements Foulable {
    Fish(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    void respond() {
        System.out.println("Fish don't talk");
    }

}
