package com.homework_7;

class ChildArray {

    static Human[] addChild(Human[] children, Human child) {
        Human[] newArray = new Human[children.length + 1];
        System.arraycopy(children, 0, newArray, 0, children.length);
        newArray[newArray.length - 1] = child;
        return newArray;
    }

    static Human[] deleteChild(Human[] children, int index) {
        if (index < 0 || index >= children.length) return children;

        Human[] newArray = new Human[children.length - 1];

        for (int i = 0, k = 0; i < children.length; i++) {
            if (i == index) continue;
            newArray[k++] = children[i];
        }

        return newArray;
    }
}
