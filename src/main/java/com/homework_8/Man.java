package com.homework_8;

final class Man extends Human {
    Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    void greetPet() {
        try {
            for (Pet pet: getFamily().getPet()) {
                String info = String.format("Hi %s from Man owner", pet.getSpecies().name());
                System.out.println(info);
            }

        } catch (Exception e) {
            System.out.println("You don't have a pet");
        }
    }

    void repairCar() {
        System.out.println("Car repaired");
    }
}
