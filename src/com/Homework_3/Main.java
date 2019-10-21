package com.Homework_3;

import java.util.Scanner;

public class Main {
    private static String[][] schedule = new String[7][2];
    private static boolean exitStatus = false;
    private static String exitText = "exit";


    static {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "Do something on Sunday";

        schedule[1][0] = "Monday";
        schedule[1][1] = "Do something on Monday";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Do something on Tuesday";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Do something on Wednesday";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "Do something on Thursday";

        schedule[5][0] = "Friday";
        schedule[5][1] = "Do something on Friday";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "Do something on Saturday";
    }

    private static void askForInput() {
        Scanner in = new Scanner(System.in);
        while (!exitStatus) {
            System.out.print("Please, input the day of the week:");
            String inputValue = in.nextLine().toLowerCase().strip();
            if (inputValue.contains("change")) {
                changeTask(inputValue);
                continue;
            }
            processInput(inputValue);
        }
    }

    private static void processInput(String inputValue) {
        if (inputValue.equals(exitText)) {
            System.out.println("Application closed");
            exitStatus = true;
            return;
        }


        for (String[] item : schedule) {
            String day = item[0];
            String task = item[1];
            boolean isDayFound = day.toLowerCase().equals(inputValue);

            if (isDayFound) {
                System.out.printf("Your task for %s is : %s \n", day, task);
                return;
            }
        }
        System.out.println("Sorry, I don't understand you, please try again.");
    }


    private static void changeTask(String inputValue) {
        String day = inputValue.substring(6).strip();
        String dayUppercase = day.substring(0, 1).toUpperCase() + day.substring(1);

        for (String[] item : schedule) {
            boolean isDayFound = day.equals(item[0].toLowerCase());

            if (isDayFound) {
                Scanner input = new Scanner(System.in);
                System.out.printf("Please, input new tasks for %s: ", dayUppercase);
                item[1] = input.nextLine();
                return;
            }
        }
        System.out.println("Sorry, I don't understand you, please try again.");
    }


    public static void main(String[] args) {
        askForInput();
    }
}
