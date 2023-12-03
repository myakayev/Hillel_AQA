package homework_8.birds.flyable_birds.impl;

import homework_8.birds.flyable_birds.FlyableBird;

public class Eagle extends FlyableBird {

    public Eagle(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Shrill screams or whistles (depends of situation)");
    }
}
