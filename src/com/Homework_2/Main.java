package com.Homework_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String[][] field = new String[6][6];
    private static int targetXValue = 0;
    private static int targetYValue = 0;
    private static boolean shotInTarget = false;

    private static void generateTarget() {
        targetXValue = new Random().nextInt(5) + 1;
        targetYValue = new Random().nextInt(5) + 1;
        System.out.printf("X val: %d , Y val: %d \n", targetXValue, targetYValue);
    }
    private static void initField() {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], "| - ");
        }
    }
    private static void drawRect() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0) {
                    System.out.printf("| %d ", j);
                } else if (j < 1) {
                    System.out.printf("| %d ", i);
                } else {
                    System.out.print(field[i][j]);
                }
                if (j == 5) System.out.print("|");
            }
            System.out.println();
        }
    }
    private static void askForInputValues() {
        Scanner in = new Scanner(System.in);
        int xValue;
        int yValue;
        while (true) {
            System.out.print("Enter X value: ");
            String value = in.nextLine();
            if (ifInputCorrect(value)) {
                xValue = Integer.parseInt(value);
                break;
            }
        }

        while (true) {
            System.out.print("Enter Y value: ");
            String value = in.nextLine();
            if (ifInputCorrect(value)) {
                yValue = Integer.parseInt(value);
                break;
            }
        }

        shoot(xValue, yValue);
    }
    private static boolean ifInputCorrect(String value) {
        try {
            int val = Integer.parseInt(value);
            if (val == 0 || val > 5) {
                System.out.println("Value must be larger than 0 and lower than 6");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Enter correct value!");
            return false;
        }
        return true;
    }
    private static void shoot(int targetX, int targetY) {
        if (targetX == targetXValue && targetY == targetYValue) {
            field[targetY][targetX] = "| + ";
            shotInTarget = true;
            return;
        }
        field[targetY][targetX] = "| * ";
    }
    private static void finishGame(){
        System.out.println("You have won!");
    }


    private static void startGame() {
        generateTarget();
        initField();
        drawRect();
        while (!shotInTarget) {
            askForInputValues();
            drawRect();
        }
        finishGame();
    }

    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        startGame();
    }
}
