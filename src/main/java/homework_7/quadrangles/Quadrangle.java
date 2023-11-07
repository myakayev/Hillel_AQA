package homework_7.quadrangles;

import homework_7.figure.Figure;

public abstract class Quadrangle extends Figure {
    public Quadrangle() {
    }

    public Quadrangle(double sideAB, double sideBC, double sideCD, double sideAD) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCD = sideCD;
        this.sideAD = sideAD;
    }

    protected double sideAB;
    protected double sideBC;
    protected double sideCD;
    protected double sideAD;

    @Override
    protected double calculatePerimeter() {
        return  sideAB + sideBC + sideCD + sideAD ;
    }

    @Override
    abstract protected double calculateSquare();
}
