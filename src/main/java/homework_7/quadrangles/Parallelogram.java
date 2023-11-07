package homework_7.quadrangles;

public class Parallelogram extends Quadrangle{
    protected double heightAD;

    public Parallelogram(double sideAB, double sideBC, double heightAD) {
        super.sideAB = super.sideCD = sideAB;
        super.sideBC = super.sideAD = sideBC;
        this.heightAD = heightAD;
    }

    @Override
    protected double calculateSquare() {
        return super.sideAD * heightAD;
    }
}
