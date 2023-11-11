package homework_8.birds;

import homework_8.Animal;
import homework_8.Movable;

public abstract class Birds extends Animal implements Movable {
    public Birds(String name, String color) {
        super(name, color);
    }

    @Override
    public void move() {
        System.out.println("I can walk like a bird!");
    }
}
