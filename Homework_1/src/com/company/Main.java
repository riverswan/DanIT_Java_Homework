package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String name = askName();
    private static int randomInt = randomValue();

    private static int randomValue() {
        return new Random().nextInt(101);
    }

    private static String askName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return in.nextLine();
    }

    private static void finishGame() {
        System.out.println("Congratulation, " + name);
        System.out.print("Your numbers are: ");
        SortArray.print();
    }

    private static int inputValue() throws InputMismatchException {
        System.out.print("Enter value: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static boolean processInputValue(int val) {
        if (val > randomInt) {
            System.out.println("Your number is too big. Please, try again.");
            return false;
        } else if (val < randomInt) {
            System.out.println("Your number is too small. Please, try again.");
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        System.out.println(randomInt);
        System.out.println("Let the game begin");
        while (true) {
            try {
                int value = inputValue();
                if (processInputValue(value)) {
                    SortArray.push(value);
                    finishGame();
                    break;
                }
                SortArray.push(value);

            } catch (Exception e) {
                System.out.println("Enter correct value");
            }
        }
    }
}
