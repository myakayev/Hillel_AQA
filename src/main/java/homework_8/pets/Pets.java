package homework_8.pets;

import homework_8.Animal;
import homework_8.Movable;

public abstract class Pets extends Animal implements Movable {

    public Pets(String name, String color, String ownerName) {
        super(name, color);
    }
}
