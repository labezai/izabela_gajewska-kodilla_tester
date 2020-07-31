package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int h;

    public Triangle(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public void calculatePerimeter() {
        int perimeter = 2 * a + b;
        System.out.println("Triangle perimeter equals" + perimeter);
    }

    @Override
    public void calculateSurfaceArea() {
        int surface = (a * h) / 2;
        System.out.println("Triangle surface equals" + surface);
    }
}

