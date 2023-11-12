package homework_8.vehicles.land_transport.impl;

import homework_8.vehicles.land_transport.LandTransport;

public class Bus extends LandTransport {

    public Bus(String brand, String color, int passengerCapacity) {
        super(brand, color);
        super.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Bus is driving");
    }
}
