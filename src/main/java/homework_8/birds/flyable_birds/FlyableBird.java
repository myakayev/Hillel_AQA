package homework_8.birds.flyable_birds;

import homework_8.Flyable;
import homework_8.birds.Birds;

public abstract class  FlyableBird extends Birds implements Flyable {
    public FlyableBird(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly() {
        System.out.println("I can fly like a bird!");
    }
}
