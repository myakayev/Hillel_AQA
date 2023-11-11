package homework_8.pets.impl;

import homework_8.pets.Pets;

public class Hamster extends Pets {
    public Hamster(String name, String color, String ownerName) {
        super(name, color, ownerName);
    }

    @Override
    protected void voice() {
        System.out.println("Squeaking or chirping");
    }

    @Override
    public void move() {
        System.out.println("I can run like a hamster!");
    }
}
