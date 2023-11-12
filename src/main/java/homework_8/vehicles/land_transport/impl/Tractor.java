package homework_8.vehicles.land_transport.impl;

import homework_8.vehicles.land_transport.LandTransport;

public class Tractor extends LandTransport {
    public Tractor(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void move() {
        System.out.println("Tractor is driving");
    }
    void plow (){
        System.out.println("It can plow a garden");
    }
}
