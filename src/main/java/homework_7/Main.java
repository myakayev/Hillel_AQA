package homework_7;

import homework_7.circle.Circle;
import homework_7.triangles.EquilateralTriangle;
import homework_7.triangles.IsoscelesTriangle;
import homework_7.triangles.RightTriangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());

        RightTriangle rightTriangle = new RightTriangle(4,7);
        System.out.println(rightTriangle.getPerimeter());
        System.out.println(rightTriangle.getSquare());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);
        System.out.println(equilateralTriangle.getPerimeter());
        System.out.println(equilateralTriangle.getSquare());

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(6, 5);
        System.out.println(isoscelesTriangle.getPerimeter());
        System.out.println(isoscelesTriangle.getSquare());
        }
}
