package homework_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Enter first coefficient");
        quadraticEquation.setFirstCoefficient(scanner.nextDouble());
        System.out.println("Enter second coefficient");
        quadraticEquation.setSecondCoefficient(scanner.nextDouble());
        System.out.println("Enter third coefficient");
        quadraticEquation.setThirdCoefficient(scanner.nextDouble());
        scanner.close();
        System.out.println(quadraticEquation.getFirstRoot());
        quadraticEquation.getSolution();
        System.out.println(quadraticEquation.getSecondRoot());

    }
}
