package homework_14;

import org.apache.commons.math3.complex.Complex;

import java.util.ArrayList;
import java.util.List;
public class QuadraticEquationSolution {
    public static List<Object> getSolution (QuadraticEquation equation) {
        double firstCoefficient = equation.firstCoefficient;
        double secondCoefficient = equation.secondCoefficient;
        double discriminator = equation.discriminator;
        List<Object> roots = new ArrayList<>();

        if (discriminator > 0) {
            double firstRoot = (- secondCoefficient + Math.sqrt(discriminator)) / (2 * firstCoefficient);
            double secondRoot = (-secondCoefficient - Math.sqrt(discriminator)) / (2 * firstCoefficient);
            roots.add(firstRoot);
            roots.add(secondRoot);
            }
        else if (discriminator == 0) {
            double firstRoot = (- secondCoefficient + Math.sqrt(discriminator)) / (2 * firstCoefficient);
            roots.add(firstRoot);
        }
        else {
                Complex complexDiscriminant = Complex.valueOf(-discriminator);
                double realPart = -secondCoefficient / (2 * firstCoefficient);
                double imaginaryPart = Math.sqrt(Math.abs(complexDiscriminant.getReal())) / (2 * firstCoefficient);
                Complex firstRoot = new Complex(realPart, imaginaryPart);
                Complex secondRoot = new Complex(realPart, -imaginaryPart);
                roots.add(firstRoot);
                roots.add(secondRoot);
            }
        return roots;
        }

        public static void printEquationResult(QuadraticEquation equation){
            double firstCoefficient = equation.firstCoefficient;
            double secondCoefficient = equation.secondCoefficient;
            double thirdCoefficient = equation.thirdCoefficient;
            double discriminator = equation.discriminator;
            List<Object> roots = getSolution(equation);
            if (roots.size() == 1) {
                System.out.println("Рівняння " + firstCoefficient + "x^2+" + secondCoefficient + "x+" + thirdCoefficient +
                        "=0 має корінь:\n x = " + roots.get(0));
            }

            else if (roots.size() == 2 && discriminator < 0) {
                System.out.println("Рівняння " + firstCoefficient + "x^2+" + secondCoefficient + "x+" + thirdCoefficient +
                        "=0 має комплексні корені:\n z1 = " + roots.get(0) + "\n z2 = " + roots.get(1));
            }
            else  {
                System.out.println("Рівняння " + firstCoefficient + "x^2+" + secondCoefficient + "x+" + thirdCoefficient +
                        "=0 має корені:\n x1 = " + roots.get(0) + "\n x2 = " + roots.get(1));
            }


        }

}



    
