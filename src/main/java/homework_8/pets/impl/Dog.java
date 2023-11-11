package homework_8.pets.impl;

import homework_8.Swimable;
import homework_8.pets.Pets;

public class Dog extends Pets implements Swimable {
    public Dog(String name, String color, String ownerName) {
        super(name, color, ownerName);
    }

    @Override
    protected void voice() {
        System.out.println("Bow-wow!");
    }

    @Override
    public void move() {
        System.out.println("I can run like a dog");
    }

    @Override
    public void swim() {
        System.out.println("I can swim like a dog!");
    }
}
