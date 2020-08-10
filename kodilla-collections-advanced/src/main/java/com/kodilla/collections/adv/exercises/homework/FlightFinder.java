package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {
    Map<String, List<Flight>> flightFinder = new HashMap<>();

    public void addFlightTable(String arrival, String departure) {

    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                result.add(flight);
        }
        return result;
    }

    public List<Flight> findFlightTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight: FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        }
        return result;

    }
    public int size() {
        return flightFinder.size();
    }
}