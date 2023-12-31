package homework_8.birds.non_flying_birds.impl;


import homework_8.Swimable;
import homework_8.birds.non_flying_birds.NonFlyableBird;

public class Penguin extends NonFlyableBird implements Swimable {
    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Braying or trumpeting");
    }

    @Override
    public void swim() {
        System.out.println("I can swim like penguin!");
    }
}
