package homework_7.triangles;

public class RightTriangle extends Triangle {
    public RightTriangle(double catheterA, double catheterB) {
        super();
        sideA = catheterA;
        sideB = catheterB;
        sideC = Math.sqrt((sideA * sideA + sideB * sideB));
    }
}
