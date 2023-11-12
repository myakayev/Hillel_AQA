package homework_8;

import lombok.Getter;
import lombok.Setter;

public abstract class Vehicle {
   @Setter
   @Getter
   protected Engine engine;
   @Getter
   private final String brand;
   @Setter
   @Getter
   String color;
   @Getter
   protected int passengerCapacity;

   public Vehicle( String brand, String color) {
      this.brand = brand;
      this.color = color;
   }
}
