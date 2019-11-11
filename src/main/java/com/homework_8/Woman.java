package com.homework_8;

final class Woman extends Human {
    Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    void greetPet() {
        try {
            String info = String.format("Hi %s from Woman owner", getFamily().getPet().getSpecies().name());
            System.out.println(info);
        } catch (Exception e) {
            System.out.println("You don't have a pet");
        }
    }

    void makeUp() {
        System.out.println("Makeup made");
    }
}
