package homework_8.vehicles.land_transport.impl;

import homework_8.vehicles.land_transport.LandTransport;

public class Car extends LandTransport {
    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void move() {
        System.out.println("Car is driving");
    }
}
