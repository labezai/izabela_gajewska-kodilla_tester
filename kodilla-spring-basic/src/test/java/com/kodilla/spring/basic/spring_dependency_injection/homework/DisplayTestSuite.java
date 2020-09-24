//package com.kodilla.spring.basic.spring_dependency_injection.homework;
//
//import org.junit.Test;
//
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import static org.junit.Assert.assertEquals;
//
//@SpringBootTest
//public class DisplayTestSuite {
//    double a = 10;
//    double b = 2;
//    private Calculator calculator;
//
//    @Test
//    public void shouldReturnCorrectSubtractValue() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Calculator bean = context.getBean(Calculator.class);
//        double subtract = bean.subtract(10,2);
//        double subtractResult = calculator.subtract(a, b);
//        assertEquals(8, subtractResult);
//    }
//
//    @Test
//    public void shouldReturnCorrectAddValue() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Calculator bean = context.getBean(Calculator.class);
//        double add = bean.add(10, 2);
//        double addResult = calculator.add(a, b);
//        assertEquals(12, addResult);
//    }
//
//    @Test
//    public void shouldReturnCorrectMultiplyValue() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Calculator bean = context.getBean(Calculator.class);
//        double multiply = bean.multiply(10, 2);
//        double multiplyResult = calculator.multiply(a, b);
//        assertEquals(20, multiplyResult);
//    }
//
//    @Test
//    public void shouldReturnCorrectDivideValue() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Calculator bean = context.getBean(Calculator.class);
//        double divide = bean.divide(10,2);
//        double divideResult = calculator.divide(a, b);
//        assertEquals(5, divideResult);
//    }
//}
