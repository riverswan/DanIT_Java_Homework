package com.homework_8;

import java.util.Arrays;
import java.util.HashSet;

abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;
    private String info;

    Pet(String nickname, int age, int trickLevel, String... habits) {
        this(nickname);
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = setHabits(habits);
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

    public HashSet<String> getHabits() {
        return habits;
    }

    public HashSet<String> setHabits(String... habits) {
        return this.habits = new HashSet<String>(Arrays.asList(habits));
    }


    public void eat() {
        System.out.println("Я кушаю!");
    }

    abstract void respond();


    @Override
    public String toString() {
        info = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits.toArray()));
        return info;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Pet object is deleted: %s \n", this.toString());
    }
}
