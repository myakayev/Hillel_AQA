package homework_7.circle;

import homework_7.figure.Figure;

public class Circle extends Figure {

    private  double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected double calculateSquare() {
        return Math.PI * radius * radius;
    }
}
