package homework_8.birds.non_flying_birds.impl;


import homework_8.birds.non_flying_birds.NonFlyableBird;

public class Ostrich extends NonFlyableBird {
    public Ostrich(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Low booming or drumming sounds");
    }
}
