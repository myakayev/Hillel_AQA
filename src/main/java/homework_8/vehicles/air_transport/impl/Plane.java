package homework_8.vehicles.air_transport.impl;

import homework_8.Movable;
import homework_8.vehicles.air_transport.AirTransport;

public class Plane extends AirTransport implements Movable {

    public Plane(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void fly() {
        System.out.println("Fly like plane");
    }

    @Override
    public void move() {
        System.out.println("Plan should move before flying");
    }
}
