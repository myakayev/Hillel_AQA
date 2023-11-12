package homework_9;

import lombok.Getter;

public enum Size {
    XS("Extra small", 28, 23), S("Small",30,25),
    M("Medium", 32, 28), L("Large", 34, 31),
    XL("Extra Large", 36, 34), XXL("Double Extra Large", 38,37);
    @Getter
    private final String shortName;
    @Getter
    private final int width;
    @Getter
    private final int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }
    public String toString() {
        return shortName + " " + width + " " + length;
    }
}
