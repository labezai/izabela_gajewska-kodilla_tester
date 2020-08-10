package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFrom() {
        assertEquals(1, flightFinder.findFlightsFrom("Warsaw").size());
    }

    @Test
    public void testFindFlightTo() {
        assertEquals(1, flightFinder.findFlightTo("Tokio").size());
    }
}