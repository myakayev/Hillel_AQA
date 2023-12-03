package homework_8.fishes;

import homework_8.Animal;
import homework_8.Movable;
import homework_8.Swimable;

public abstract class Fish extends Animal implements Swimable {
    public Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public void voice() {
        System.out.println("Silent as a fish");
    }

    @Override
    public void swim() {
        System.out.println("I can swim like a fish!");
    }
}
