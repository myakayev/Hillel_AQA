package homework_6;

public class Triangle {
    //sides of the triangle (mm)
    int sideA;
    int sideB;
    int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int b, int sideC) {
        this.sideA = sideA;
        this.sideB = b;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    int perimeter () {
        return sideA + sideB + sideC;
    }
    double square () {
        double p = (double) (sideA + sideB + sideC) / 2; // half perimeter
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

}
