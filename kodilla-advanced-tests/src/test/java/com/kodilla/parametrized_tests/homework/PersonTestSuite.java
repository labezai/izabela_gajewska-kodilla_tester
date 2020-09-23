package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    private Person manipulator = new Person();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonBMI#personList")

    public void shouldCalculatePersonBMI(double input, String expected) {
        assertEquals(expected, manipulator.getBMI(input));

    }

}