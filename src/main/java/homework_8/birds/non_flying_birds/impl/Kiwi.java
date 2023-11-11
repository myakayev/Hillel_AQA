package homework_8.birds.non_flying_birds.impl;

import homework_8.birds.non_flying_birds.NonFlyableBird;

public class Kiwi extends NonFlyableBird {
    public Kiwi(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println("Melodious and tender whistling");
    }

    @Override
    public void move() {
        System.out.println("I can run very fast!");
    }
}
