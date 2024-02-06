
package homework_14;
import org.apache.commons.math3.complex.Complex;

public class QuadraticEquation {
    double firstCoefficient;
    double secondCoefficient;
    double thirdCoefficient;
    double discriminator;

    public QuadraticEquation(double firstCoefficient, double secondCoefficient, double thirdCoefficient) {
        this.firstCoefficient = firstCoefficient;
        this.secondCoefficient = secondCoefficient;
        this.thirdCoefficient = thirdCoefficient;
        this.discriminator = discriminatorCalculation();
    }



    public double discriminatorCalculation() {
        return (secondCoefficient * secondCoefficient) - (4 * firstCoefficient * thirdCoefficient);
        }




}
