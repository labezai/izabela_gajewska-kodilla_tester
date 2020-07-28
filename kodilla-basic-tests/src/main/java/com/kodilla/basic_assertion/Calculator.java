package com.kodilla.basic_assertion;

import org.w3c.dom.ls.LSOutput;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    static class MathFunctions {
        public static void main(String[] args) {
            double first = 3.0;
            int second = 2;
            double sqrt = Math.pow(first, second);
        }
    }
}

