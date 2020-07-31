package com.kodilla.abstracts.homework;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = a * 4;
        System.out.println("Square perimeter equals" + perimeter);
    }

    @Override
    public void calculateSurfaceArea() {
        int surface = a * a;
        System.out.println("Square surface equals" + surface);
    }
}