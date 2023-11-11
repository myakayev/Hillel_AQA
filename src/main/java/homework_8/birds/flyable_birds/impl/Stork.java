package homework_8.birds.flyable_birds.impl;

import homework_8.birds.flyable_birds.FlyableBird;

public class Stork extends FlyableBird {
    public Stork(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println("Some clattering");
    }
}
