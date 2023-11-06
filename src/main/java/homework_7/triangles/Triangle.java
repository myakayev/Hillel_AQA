package homework_7.triangles;

import homework_7.figure.Figure;

public abstract class Triangle extends Figure {
    //sides of the triangle (mm)
    protected double sideA;
    protected double sideB;
    protected double sideC;

    @Override
    protected double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    protected double calculateSquare() {
        double p = (double) (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
