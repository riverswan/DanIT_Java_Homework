package com.homework_6;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private String info;

    Pet() {
        species = null;
        nickname = "";
        age = -1;
        trickLevel = -1;
        habits = new String[0];
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String... habits) {
        this(species, nickname);
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
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

    public void respond() {
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился! \n", nickname);
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public String toString() {
        info = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits));
        return info;
    }

    @Override
    protected void finalize() throws Throwable {
        info = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits));
        System.out.printf("Pet object is deleted: %s \n", info);
    }
}
