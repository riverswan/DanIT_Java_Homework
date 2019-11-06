package com.homework_7;

import java.util.Arrays;
import java.util.Objects;

class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private String info;

    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(Family.this);
        this.father.setFamily(Family.this);
        pet = null;
        children = new Human[0];
        info = String.format("Mother:%s,\nFather:%s,\nChildren:%s,\nPet:%s",
                Objects.toString(mother), Objects.toString(father), Arrays.toString(children), Objects.toString(pet));

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

    public Human[] addChild(Human child) {
        child.setFamily(Family.this);
        return children = ChildArray.addChild(children, child);
    }

    public Human[] deleteChild(int index) {
        return children = ChildArray.deleteChild(children, index);
    }

    public int countFamily() {
        int petCount = pet != null ? 1 : 0;
        return 2 + children.length + petCount;
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
