package homework_8.vehicles;

import lombok.Getter;

public class Wheel {
    @Getter
    private final String type;
    @Getter
    private final double size;

    public Wheel(String type, double size) {
        this.type = type;
        this.size = size;
    }
}
