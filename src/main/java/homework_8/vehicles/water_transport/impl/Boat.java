package homework_8.vehicles.water_transport.impl;

import homework_8.vehicles.water_transport.WaterTransport;
import lombok.Getter;
import lombok.Setter;

public class Boat extends WaterTransport {
    @Getter
    @Setter
    boolean oars;

    public Boat(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void swim() {
        System.out.println("Swim like a boat");
    }
}
