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
        this.mother.setFamily(Family.this);
        this.father.setFamily(Family.this);
        children = new Human[0];
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

    public void addChild(Human child) {
        children = ChildArray.addChild(children, child);
    }

    public void deleteChild(int index) {
        children = ChildArray.deleteChild(children, index);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        String info = String.format("Mother:%s,\nfather:%s,\nchildren:%s,\npet:%s",
                mother.toString(), father.toString(), Arrays.toString(children), pet.toString());

        System.out.println(info);
        return info;
    }
}
