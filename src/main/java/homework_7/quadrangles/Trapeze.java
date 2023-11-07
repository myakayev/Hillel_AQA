package homework_7.quadrangles;

public class Trapeze extends Quadrangle{
    double heightAD;
    public Trapeze(double sideAB, double sideBC, double sideCD, double sideAD, double heightAD) {
        super(sideAB, sideBC, sideCD, sideAD);
        this.heightAD = heightAD;
    }

    @Override
    protected double calculateSquare() {
        return (sideBC + sideAD) /2 * heightAD;
    }
}
