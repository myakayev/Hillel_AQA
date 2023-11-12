package homework_8.vehicles.air_transport.impl;

import homework_8.Movable;
import homework_8.vehicles.air_transport.AirTransport;

public class Helicopter extends AirTransport implements Movable {

    public Helicopter(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void fly() {
        System.out.println("Fly like helicopter");
    }

    @Override
    public void move() {
        System.out.println("Helicopter can move before flying");
    }
}
