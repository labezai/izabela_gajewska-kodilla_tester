package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"kowalski", "gajewski"})
    public void shouldReturnTrue(String userName) {
        assertTrue(userValidator.validateUsername(userName));
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna.anna@wp.pl", "anna.anna@wp.pl"})
    public void checkEmail(String email) {
        assertTrue(userValidator.validateEmail(email));

    }


}


