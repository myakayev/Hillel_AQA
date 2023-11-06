package classwork_11;

public class Horse extends Animal{
    String color;

    public String getColor() {
        return color;
    }

    public Horse(String name, String color) {
        super(name);
    }
    public String toString() {
        return "Igogo";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Horse) {
            if (obj.hashCode() != this.hashCode()) {
                return false;
            }
            return ((Horse) obj).getName().equals(this.getName()) && ((Horse) obj).getColor().equals(this.getColor());
        }
        return true;
    }


}
