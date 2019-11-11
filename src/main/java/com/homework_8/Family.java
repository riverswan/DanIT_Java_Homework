package com.homework_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Pet pet;
    private String info;

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(Family.this);
        this.father.setFamily(Family.this);
        pet = null;
        children = new ArrayList<Human>(0);
        info = String.format("Mother:%s,\nFather:%s,\nChildren:%s,\nPet:%s",
                Objects.toString(mother), Objects.toString(father), Arrays.toString(children.toArray()), Objects.toString(pet));

    }

    Human getMother() {
        return mother;
    }


    Human getFather() {
        return father;
    }


    ArrayList<Human> getChildren() {
        return children;
    }


    Pet getPet() {
        return pet;
    }

    void setPet(Pet pet) {
        this.pet = pet;
    }

    ArrayList<Human> addChild(Human child) {
        child.setFamily(Family.this);
        children.add(child);
        return children;
    }

    ArrayList<Human> deleteChild(int index) {
        try {
            children.remove(index);
            return children;
        } catch (Exception e) {
            System.out.println("Invalid argument: " + e.getMessage());
            return children;
        }
    }

    int countFamily() {
        int petCount = pet != null ? 1 : 0;
        return 2 + children.size() + petCount;
    }

    @Override
    public String toString() {

        System.out.println(info);
        return info;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Family object is deleted: %s \n", info);
    }
}
