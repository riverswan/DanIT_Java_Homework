package com.homework_7;

class FamilyCreator {
    public void createFamily() {

        Human father = new Human("Father", "Father surname", 1970);
        Human mother = new Human("Mother", "Mother surname", 1970);
//        Pet pet = new Pet(Species.DOG, "Jack", 2, 75, "eat", "sleep");
        Human son1 = new Human("Son 1", "Son surname", 2000, 100);
        Human son2 = new Human("Son 2", "Son surname", 2000, 100);
        Human son3 = new Human("Son 3", "Son surname", 2000, 100);
        Human son4 = new Human("Son 4", "Son surname", 2000, 100);

        Family family1 = new Family(mother, father);
        family1.addChild(son1);
        family1.addChild(son2);
        family1.addChild(son3);
        family1.addChild(son4);

        family1.deleteChild(1);
        family1.deleteChild(3);
        family1.deleteChild(2);

//        family1.setPet(pet);
        System.out.println(family1.countFamily());

        family1.toString();
    }
}
