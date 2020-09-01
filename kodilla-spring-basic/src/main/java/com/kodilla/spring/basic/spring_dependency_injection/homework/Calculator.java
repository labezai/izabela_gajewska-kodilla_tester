package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    double a = 10;
    double b = 2;
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Calculator() {
        double a = 10;
        double b = 2;
    }

    public String display(double value) {
        if (checkValue(value)) {
            return this.display.display(value);
        }
        return null;
    }

    private boolean checkValue(double value) {
        return checkValue(value);
    }

    public double add(double a, double b) {
        return (a + b);
    }

    public double subtract(double a, double b) {
        return (a - b);
    }

    public double multiply(double a, double b) {
        return (a * b);
    }

    public double divide(double a, double b) {
        return (a / b);
    }
}


