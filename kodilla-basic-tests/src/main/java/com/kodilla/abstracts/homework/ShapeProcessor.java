package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        Triangle triangle = new Triangle(4, 1, 3);
        Square square = new Square(9);
        process(rectangle);
        process(triangle);
        process(square);
    }

    public static void process(Shape shape) {
        shape.calculatePerimeter();
        shape.calculateSurfaceArea();
    }
}
