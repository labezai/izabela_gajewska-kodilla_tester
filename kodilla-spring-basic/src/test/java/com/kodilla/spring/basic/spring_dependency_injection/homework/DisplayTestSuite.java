package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class DisplayTestSuite {
    double a = 10;
    double b = 2;
    private Calculator calculator;

    @Test
    public void shouldReturnCorrectSubtractValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double subtractResult = calculator.subtract(a, b);
        assertEquals(8, subtractResult, 0.1);
    }

    @Test
    public void shouldReturnCorrectAddValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double addResult = calculator.add(a, b);
        assertEquals(12, addResult, 0.1);
    }

    @Test
    public void shouldReturnCorrectMultiplyValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double multiplyResult = calculator.multiply(a, b);
        assertEquals(20, multiplyResult, 0.1);
    }

    @Test
    public void shouldReturnCorrectDivideValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        double divideResult = calculator.divide(a, b);
        assertEquals(5, divideResult, 0.1);
    }
}
