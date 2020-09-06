//package com.kodilla.basic_assertion;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class CalculatorTestSuite {
//    Calculator calculator = new Calculator();
//    int a = 5;
//    int b = 8;
//
//    @Test
//    public void testSum() {
//        int sumResult = calculator.sum(a, b);
//        assertEquals(13, sumResult);
//    }
//
//    @Test
//    public void testSubtract() {
//        int substractResult = calculator.subtract(a, b);
//        assertEquals(-3, substractResult);
//    }
//
//    @Test
//    public void testMathFunctions() {
//        double first = 3;
//        int second = 3;
//        double powResult = Calculator.mathFunctions(first, second);
//        assertEquals(9, powResult);
//    }
//}