package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calculatePerimeter() {
        int perimeter = 2*a + 2*b;
        System.out.println("Rectangle perimeter equals " + perimeter);
    }

    @Override
    public void calculateSurfaceArea() {
        int surface = a * b;
        System.out.println("Rectangle surface equals " + surface);
    }
}