package homework_14;

import org.apache.commons.math3.complex.Complex;
import java.util.Scanner;
public class ComplexSolution {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter coefficients (a, b, c) for the quadratic equation ax^2 + bx + c = 0:");

            System.out.print("Enter a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter c: ");
            double c = scanner.nextDouble();

            // Обчислення дискримінанту
            double discriminant = b * b - 4 * a * c;

            if (discriminant >= 0) {
                // Обчислення реальних коренів (не обробляються комплексні корені у цьому випадку)
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Real roots:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else {
                // Обчислення комплексних коренів
                Complex complexDiscriminant = Complex.valueOf(-discriminant);
                //Complex complexRoot1 = new Complex(-b / (2 * a), Math.sqrt(complexDiscriminant.getImaginary()) / (2 * a));
                //Complex complexRoot2 = new Complex(-b / (2 * a), -Math.sqrt(complexDiscriminant.getImaginary()) / (2 * a));
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(Math.abs(complexDiscriminant.getImaginary())) / (2 * a);

                Complex complexRoot1 = new Complex(realPart, imaginaryPart);
                Complex complexRoot2 = new Complex(realPart, -imaginaryPart);
                System.out.println("Complex roots:");
                System.out.println("Root 1: " + complexRoot1);
                System.out.println("Root 2: " + complexRoot2);
            }
        }
    }



    
