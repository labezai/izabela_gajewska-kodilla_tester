package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTestSuite {

    @Test
    public void testSedanCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Sedan sedan = context.getBean(Sedan.class);
        //When
        String carType = sedan.getCarType();
        //Then
        Assertions.assertEquals("Sedan", carType);
    }

}