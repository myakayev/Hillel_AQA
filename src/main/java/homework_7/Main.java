package homework_7;

import homework_7.circle.Circle;
import homework_7.quadrangles.Quadrate;
import homework_7.quadrangles.Rectangle;
import homework_7.quadrangles.Trapeze;
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

        Quadrate quadrate = new Quadrate(5);
        System.out.println(quadrate.getPerimeter());
        System.out.println(quadrate.getSquare());

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());

        Trapeze trapeze = new Trapeze(5, 6, 7, 8, 3);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());

        }
}
