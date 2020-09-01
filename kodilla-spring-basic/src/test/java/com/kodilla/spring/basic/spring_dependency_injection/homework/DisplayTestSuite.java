package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DisplayTestSuite {
    Calculator calculator = new Calculator();
    double a = 10;
    double b = 2;

    @Test
    public void shouldReturnCorrectSubtractValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String subtract = bean.display(8);
        double subtractResult = calculator.subtract(a, b);
        assertEquals(8, subtractResult);
    }

    @Test
    public void shouldReturnCorrectAddValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String add = bean.display(12);
        double addResult = calculator.add(a, b);
        assertEquals(12, addResult);
    }

    @Test
    public void shouldReturnCorrectMultiplyValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String multiply = bean.display(20);
        double multiplyResult = calculator.multiply(a, b);
        assertEquals(20, multiplyResult);
    }

    @Test
    public void shouldReturnCorrectDivideValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        String divide = bean.display(5);
        double divideResult = calculator.divide(a, b);
        assertEquals(5, divideResult);
    }
}
