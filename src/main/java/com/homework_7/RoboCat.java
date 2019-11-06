package com.homework_7;

 class RoboCat extends Pet implements Animal {
    RoboCat(String nickname, int age, int trickLevel, String... habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.ROBOCAT);
    }

    @Override
    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", getNickname());
    }

    @Override
    public void foul() {
        String info = String.format("Я %s , нужно замести следы", getSpecies());
        System.out.println(info);
    }
}
