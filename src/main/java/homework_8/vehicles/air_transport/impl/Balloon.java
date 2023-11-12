package homework_8.vehicles.air_transport.impl;

import homework_8.vehicles.air_transport.AirTransport;

public class Balloon extends AirTransport {
    public Balloon(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void fly() {
        System.out.println("Fly like balloon");
    }
}
