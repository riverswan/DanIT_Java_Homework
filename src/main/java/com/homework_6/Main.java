package com.homework_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FamilyCreator family = new FamilyCreator();
        family.createFamily();

        Human human = new Human("12", "12", 12);
        human.setSchedule(dayOfWeek.SUNDAY, "new task");
        System.out.println(Arrays.deepToString(human.getSchedule()));

//        for (int i = 0; i < 10000000 ; i++) {
//            new Human("Name", "Surname",1980);
//        }


    }
}
