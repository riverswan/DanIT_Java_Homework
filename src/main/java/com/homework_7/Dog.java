package com.homework_7;

class Dog extends Pet implements Foulable {
    Dog(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", getNickname());
    }

    @Override
    public void foul() {
        String info = String.format("Я %s , нужно замести следы", getSpecies());
        System.out.println(info);
    }
}
