package com.homework_9;

class Main {
    public static void main(String[] args) {
        Human mother1 = new Woman("Woman1", "Surname1", 1970);
        Human mother2 = new Woman("Woman2", "Surname2", 1970);
        Human mother3 = new Woman("Woman3", "Surname3", 1970);


        Human father1 = new Man("Father1", "Surname1", 1970);
        Human father2 = new Man("Father2", "Surname1", 1970);
        Human father3 = new Man("Father3", "Surname1", 1970);

        Human son1 = new Man("Son1", "Surname1", 1970);
        Human son2 = new Man("Son2", "Surname1", 1970);
        Human son3 = new Man("Son3", "Surname1", 1970);

        Family family1 = new Family(mother1, father1);
        family1.addChild(son1);
        family1.addChild(son2);
        family1.addChild(son3);


        Family family2 = new Family(mother2, father2);
        Family family3 = new Family(mother3, father3);

        FamilyController familyController = new FamilyController();
        familyController.createNewFamily(mother1,father1);
        familyController.displayAllFamilies();
    }
}
