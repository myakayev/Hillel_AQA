package homework_8.vehicles.water_transport.impl;

import homework_8.vehicles.water_transport.WaterTransport;

public class Cater extends WaterTransport {
    public Cater(String brand, String color, int passengerCapacity) {
        super(brand, color);
        super.passengerCapacity = passengerCapacity;
    }

    @Override
    public void swim() {
        System.out.println("Swim like cater!");
    }
}
