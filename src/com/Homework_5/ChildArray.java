package com.Homework_5;

public class ChildArray {

    static Human[] addChild(Human[] children, Human child) {
        Human[] newArray = new Human[children.length + 1];
        System.arraycopy(children, 0, newArray, 0, children.length);
        newArray[children.length - 1] = child;
        return newArray;
    }

    static boolean deleteChild(Human[] children, int index) {
        if (index < 0 || index > children.length) return false;

        Human[] newArray = new Human[children.length];
//        System.arraycopy(children, 0, newArray, index, );

        return false;
    }
}
