package homework_7.figure;

public abstract class Figure {
    protected double perimeter;
    protected double square;

    public double getPerimeter() {
        if (perimeter <= 0) {
            perimeter = calculatePerimeter();
        }
        return perimeter;
    }

    public double getSquare() {
        if (square <= 0) {
            square = calculateSquare();
        }
        return square;
    }

    protected abstract double calculatePerimeter();
    protected abstract double calculateSquare();
}
