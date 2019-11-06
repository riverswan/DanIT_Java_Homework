package com.homework_7;

public class Dog extends Pet implements Animal {
    Dog(Species species, String nickname, int age, int trickLevel, String... habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", super.getNickname());
    }

    @Override
    public void foul() {
        String info = String.format("Я %s , нужно замести следы", super.getSpecies());
        System.out.println(info);
    }

}
