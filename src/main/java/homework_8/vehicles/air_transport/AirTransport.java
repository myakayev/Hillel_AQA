package homework_8.vehicles.air_transport;

import homework_8.Flyable;
import homework_8.Vehicle;

public abstract class AirTransport extends Vehicle implements Flyable {

    public AirTransport(String brand, String color) {
        super(brand, color);
    }
}
