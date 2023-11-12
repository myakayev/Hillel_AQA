package homework_8.vehicles.water_transport;

import homework_8.Swimable;
import homework_8.Vehicle;

public abstract class WaterTransport extends Vehicle implements Swimable {
    public WaterTransport(String brand, String color) {
        super(brand, color);
    }
}
