package com.homework_7;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String info;
    private String[][] schedule = initSchedule();

    Human() {
        name = "";
        surname = "";
        year = -1;
        iq = -1;
        schedule = new String[0][];
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


    private String[][] initSchedule() {
        schedule = new String[7][2];

        schedule[0][0] = dayOfWeek.SUNDAY.name();
        schedule[0][1] = "";

        schedule[1][0] = dayOfWeek.MONDAY.name();
        schedule[1][1] = "";


        schedule[2][0] = dayOfWeek.TUESDAY.name();
        schedule[2][1] = "";


        schedule[3][0] = dayOfWeek.WEDNESDAY.name();
        schedule[3][1] = "";


        schedule[4][0] = dayOfWeek.THURSDAY.name();
        schedule[4][1] = "";


        schedule[5][0] = dayOfWeek.FRIDAY.name();
        schedule[5][1] = "";


        schedule[6][0] = dayOfWeek.SATURDAY.name();
        schedule[6][1] = "";
        return schedule;
    }

    public Family getFamily() {
        return family;
    }


    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public String setSurname(String surname) {
        this.surname = surname;
        return this.surname;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        this.year = year;
        return this.year;
    }

    public int getIq() {
        return iq;
    }

    public int setIq(int iq) {
        this.iq = iq;
        return this.iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public String[][] setSchedule(dayOfWeek day, String todo) {
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
            schedule[index][1] = todo;
        } catch (Exception e) {
            System.out.println("You've entered wrong day");
        }

        return schedule;
    }


    public void greetPet() {
        System.out.printf("Привет, %s \n", family.getPet().getNickname());
    }

    public String describePet() {
        String trickLevel = family.getPet().getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый";
        String description = String.format("У меня есть %s, ему %d лет, он %s ", family.getPet().getSpecies(), family.getPet().getAge(), trickLevel);
        System.out.println(description);
        return description;
    }

    public Family setFamily(Family family) {
        this.family = family;
        return this.family;
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
