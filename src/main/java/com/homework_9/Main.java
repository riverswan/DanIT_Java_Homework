package com.homework_9;

class Main {
    public static void main(String[] args) {
        Human mother1 = new Woman("Woman1", "Surname1", 1970);
        Human mother2 = new Woman("Woman2", "Surname2", 1970);
        Human mother3 = new Woman("Woman3", "Surname3", 1970);


        Human father1 = new Man("Father1", "Surname1", 1970);
        Human father2 = new Man("Father2", "Surname1", 1970);
        Human father3 = new Man("Father3", "Surname1", 1970);


        Human adoptedSon1 = new Man("Adopted_1", "Surname1", 1970);
        Human adoptedSon2 = new Man("Adopted_2", "Surname1", 1970);
        Human adoptedSon3 = new Man("Adopted_3", "Surname1", 1970);


        FamilyController familyController = new FamilyController();
        Family family1 = familyController.createNewFamily(mother1, father1);
        Family family2 = familyController.createNewFamily(mother2, father2);
        Family family3 = familyController.createNewFamily(mother3, father3);

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1", "WomanChildFamily_1");

        familyController.displayAllFamilies();

        familyController.bornChild(family1, "ManChildFamily_1_child_2", "WomanChildFamily_1_child_2");

        familyController.displayAllFamilies();

        familyController.getFamiliesBiggerThan(3);

        familyController.getFamiliesLessThan(3);

        familyController.countFamiliesWithMemberNumber(4);

        familyController.adoptChild(family1,adoptedSon1);
        familyController.adoptChild(family1,adoptedSon2);
        familyController.adoptChild(family1,adoptedSon3);

        familyController.displayAllFamilies();

        familyController.deleteAllChildrenOlderThen(10);

        familyController.displayAllFamilies();

        System.out.println(familyController.count());

        System.out.println(familyController.getFamilyById(2));

        System.out.println(familyController.getPets(0));

        familyController.getFamiliesBiggerThan(-1);

        familyController.deleteFamilyByIndex(1);

        familyController.displayAllFamilies();

    }
}
