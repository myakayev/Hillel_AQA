package homework_8.pets.impl;

import homework_8.Swimable;
import homework_8.pets.Pets;

public class Cat extends Pets implements Swimable {
    public Cat(String name, String color, String ownerName) {
        super(name, color, ownerName);
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("I can run like a cat!");
    }

    @Override
    public void swim() {
        System.out.println("I don't like swim but I can!");
    }
}
