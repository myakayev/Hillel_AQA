package homework_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first coefficient");
        double firstCoefficient = scanner.nextDouble();
        System.out.println("Enter second coefficient");
        double secondCoefficient = scanner.nextDouble();
        System.out.println("Enter third coefficient");
        double thirdCoefficient = scanner.nextDouble();;
        scanner.close();
        QuadraticEquation quadraticEquation = new QuadraticEquation(firstCoefficient, secondCoefficient, thirdCoefficient);
        System.out.println(QuadraticEquationSolution.getSolution(quadraticEquation));
    }
}
