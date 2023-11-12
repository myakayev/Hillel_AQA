package homework_8.vehicles.land_transport;

import homework_8.Movable;
import homework_8.Vehicle;
import homework_8.vehicles.Wheel;
import lombok.Getter;
import lombok.Setter;

public abstract class LandTransport extends Vehicle implements Movable {
    @Getter
    @Setter
    Wheel wheel;
    public LandTransport(String brand, String color) {
        super(brand, color);
    }
}
