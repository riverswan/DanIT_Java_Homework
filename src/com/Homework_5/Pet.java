package com.Homework_5;

import java.util.Arrays;

public class Pet {
   private String species;
   private String nickname;
   private int age;
   private int trickLevel;
   private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String... habits) {
        this.habits = habits;
    }

    Pet() {
        species = "";
        nickname = "";
        age = -1;
        trickLevel = -1;
        habits = new String[0];
    }

    public Pet(String species, String nickname, int age, int trickLevel, String... habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
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
        String info = String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits));
        System.out.println(info);
        return info;
    }
}
