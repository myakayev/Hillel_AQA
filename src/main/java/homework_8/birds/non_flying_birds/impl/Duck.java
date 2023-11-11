package homework_8.birds.non_flying_birds.impl;

import homework_8.Swimable;
import homework_8.birds.non_flying_birds.NonFlyableBird;

public class Duck extends NonFlyableBird implements Swimable {
    public Duck(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println("Quack-quack!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim like duck!");
    }
}
