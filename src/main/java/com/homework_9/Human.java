package com.homework_9;

import java.util.HashMap;
import java.util.Map;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String info;
    private Map<String, String> schedule = initSchedule();

    Human() {
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        schedule = new HashMap<String, String>(0);
        family = null;
    }

    Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    Human(String name, String surname, int year, int iq) {
        this(name, surname, year);
        this.iq = iq;
    }


    private Map<String, String> initSchedule() {
        schedule = new HashMap<String, String>();

        schedule.put(DayOfWeek.SUNDAY.name(), "");
        schedule.put(DayOfWeek.MONDAY.name(), "");
        schedule.put(DayOfWeek.TUESDAY.name(), "");
        schedule.put(DayOfWeek.WEDNESDAY.name(), "");
        schedule.put(DayOfWeek.THURSDAY.name(), "");
        schedule.put(DayOfWeek.FRIDAY.name(), "");
        schedule.put(DayOfWeek.SATURDAY.name(), "");

        return schedule;
    }

    Family setFamily(Family family) {
        this.family = family;
        return this.family;
    }

    Family getFamily() {
        return family;
    }


    String getName() {
        return name;
    }


    String setName(String name) {
        this.name = name;
        return this.name;
    }

    String getSurname() {
        return surname;
    }

    String setSurname(String surname) {
        this.surname = surname;
        return this.surname;
    }

    int getYear() {
        return year;
    }

    int setYear(int year) {
        this.year = year;
        return this.year;
    }

    int getIq() {
        return iq;
    }

    int setIq(int iq) {
        this.iq = iq;
        return this.iq;
    }


    Map<String, String> getSchedule() {
        return schedule;
    }

    Map<String, String> setSchedule(DayOfWeek day, String todo) {
        int index;
        switch (day) {
            case SUNDAY:
                index = 0;
                break;
            case MONDAY:
                index = 1;
                break;
            case TUESDAY:
                index = 2;
                break;
            case WEDNESDAY:
                index = 3;
                break;
            case THURSDAY:
                index = 4;
                break;
            case FRIDAY:
                index = 5;
                break;
            case SATURDAY:
                index = 6;
                break;
            default:
                index = -1;
        }

        try {
            schedule.replace(String.valueOf(index), todo);
        } catch (Exception e) {
            System.out.println("You've entered wrong day");
        }

        return schedule;
    }


    void greetPet() {
        for (Pet pet : family.getPet()) {
            System.out.printf("Привет, %s \n", pet.getNickname());
        }

    }


    void describePet() {
        for (Pet pet : family.getPet()) {
            String trickLevel = pet.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый";
            String description = String.format("У меня есть %s, ему %d лет, он %s ", pet.getSpecies(), pet.getAge(), trickLevel);
            System.out.println(description);
        }
    }


    @Override
    public String toString() {
        info = String.format("Human{name='%s', surname='%s', year=%d}", name, surname, year);
        return info;
    }


    @Override
    public boolean equals(Object obj) {
        Human human = (Human) obj;
        if (this == obj) return true;
        return name.equals(human.getName()) && surname.equals(human.getSurname()) && year == human.getYear();
    }

    @Override
    public int hashCode() {
        int code = 11;
        int k = 7;
        code = k * code + 31;
        code = k * code + surname.hashCode();
        return code;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Human object is deleted: %s \n", this.toString());
    }
}
