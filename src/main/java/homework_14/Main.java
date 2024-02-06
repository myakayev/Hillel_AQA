package homework_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перший коефіцієнт");
        double firstCoefficient = scanner.nextDouble();
        System.out.println("Введіть другий коефіцієнт");
        double secondCoefficient = scanner.nextDouble();
        System.out.println("Введіть третій коефіцієнт");
        double thirdCoefficient = scanner.nextDouble();;
        scanner.close();
        QuadraticEquation quadraticEquation = new QuadraticEquation(firstCoefficient, secondCoefficient, thirdCoefficient);
        QuadraticEquationSolution.printEquationResult(quadraticEquation);
    }
}
