package homework_6;

public class Triangle {
    //sides of the triangle (mm)
    int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    int perimeter () {
        return a + b + c;
    }
    double square () {
        double p = (double) (a + b + c) / 2; // half perimeter
        return Math.sqrt(p * (p - a) * (p -b) * (p - c));
    }

}
