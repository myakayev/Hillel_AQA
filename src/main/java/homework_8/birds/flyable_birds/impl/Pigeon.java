package homework_8.birds.flyable_birds.impl;

import homework_8.birds.flyable_birds.FlyableBird;

public class Pigeon extends FlyableBird {

    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Coo!");
    }
}
