package com.Homework_5;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;

    public Family getFamily() {
        return family;
    }


    private String[][] schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    Human() {
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        schedule = new String[0][];
        family = null;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public void greetPet() {
        System.out.printf("Привет, %s \n", family.getPet().getNickname());
    }

    public void describePet() {
        String trickLevel = family.getPet().getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый";
        System.out.printf("У меня есть %s, ему %d лет, он %s \n", family.getPet().getSpecies(), family.getPet().getAge(), trickLevel);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d}", name, surname, year);
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
