package com.homework_9;

class DomesticCat extends Pet implements Foulable {
    DomesticCat(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", super.getNickname());
    }

    @Override
    public void foul() {
        String info = String.format("Я %s , нужно замести следы", super.getSpecies());
        System.out.println(info);
    }
}
