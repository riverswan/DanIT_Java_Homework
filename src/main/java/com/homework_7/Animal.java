package com.homework_7;

interface Animal {
    default void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }
}
