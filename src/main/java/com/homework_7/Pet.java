package com.homework_7;

import java.util.Arrays;

abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private String info;

    Pet(String nickname, int age, int trickLevel, String... habits) {
        this(nickname);
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    Pet(String nickname) {
        this.nickname = nickname;
        this.species = Species.UNKNOWN;
    }

    public Species getSpecies() {
        return species;
    }

    public Species setSpecies(Species species) {
        return this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public String setNickname(String nickname) {
        return this.nickname = nickname;

    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public int setTrickLevel(int trickLevel) {
        return this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public String[] setHabits(String... habits) {
        return this.habits = habits;
    }


    public void eat() {
        System.out.println("Я кушаю!");
    }

    abstract void respond();


    @Override
    public String toString() {
        info = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits));
        return info;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Pet object is deleted: %s \n", this.toString());
    }
}
