package com.Homework_5;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = new Human[0];
        this.mother.setFamily(Family.this);
        this.father.setFamily(Family.this);
    }

    public Human getMother() {
        return mother;
    }


    public Human getFather() {
        return father;
    }


    public Human[] getChildren() {
        return children;
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        String info = String.format("Mother:%s, father:%s, children=%s, pet=%s",
                mother.toString(), father.toString(), Arrays.toString(children), pet.toString());
        System.out.println(info);
        return info;
    }
}
