package com.homework_9;

class Main {
    public static void main(String[] args) {
        Human mother1 = new Woman("Woman1", "Surname1", 1970);
        Human mother2 = new Woman("Woman2", "Surname2", 1970);
        Human mother3 = new Woman("Woman3", "Surname3", 1970);


        Human father1 = new Man("Father1", "Surname1", 1970);
        Human father2 = new Man("Father2", "Surname1", 1970);
        Human father3 = new Man("Father3", "Surname1", 1970);


        FamilyController familyController = new FamilyController();
        Family family1 = familyController.createNewFamily(mother1, father1);
        Family family2 = familyController.createNewFamily(mother2, father2);
        Family family3 = familyController.createNewFamily(mother3, father3);

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1", "WomanChildFamily_1");

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1_child_2", "WomanChildFamily_1_child_2");

        familyController.displayAllFamilies();
    }
}
