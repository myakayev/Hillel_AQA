
package homework_14;
import org.apache.commons.math3.complex.Complex;

public class QuadraticEquation {
    double firstCoefficient;
    double secondCoefficient;
    double thirdCoefficient;
    double discriminator;

    public double discriminator() {
        return (secondCoefficient * secondCoefficient) - (4 * firstCoefficient * thirdCoefficient);
        }

    public double getFirstRoot () {
        discriminator = discriminator();
        return (- secondCoefficient + Math.sqrt(discriminator)) / (2 * firstCoefficient);

    }

    public double getSecondRoot () {
        discriminator = discriminator();
        return (-secondCoefficient - Math.sqrt(discriminator)) / (2 * firstCoefficient);
    }

    public void getSolution () {
        discriminator = discriminator();
        if (discriminator > 0) {
            System.out.println("Рівняння " + firstCoefficient + "x^2+" + secondCoefficient + "x+" + thirdCoefficient +
                    "=0 має корені:\n x1 = " + getFirstRoot());
        }
/*
        if (discriminator < 0) {
            //Complex firstRoot =  (Complex)getFirstRoot();
        }
*/

    }

    public void setFirstCoefficient(double firstCoefficient) {
        this.firstCoefficient = firstCoefficient;
    }

    public void setSecondCoefficient(double secondCoefficient) {
        this.secondCoefficient = secondCoefficient;
    }

    public void setThirdCoefficient(double thirdCoefficient) {
        this.thirdCoefficient = thirdCoefficient;
    }
}
