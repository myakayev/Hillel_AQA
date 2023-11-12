package homework_8.vehicles.water_transport.impl;

import homework_8.vehicles.water_transport.WaterTransport;

public class Barge extends WaterTransport {
    double carryingCapacity;
    int size;

    public Barge(String brand, String color, double carryingCapacity, int size) {
        super(brand, color);
        this.carryingCapacity = carryingCapacity;
        this.size = size;
    }

    @Override
    public void swim() {
        System.out.println("Swim like barge");

    }
}
