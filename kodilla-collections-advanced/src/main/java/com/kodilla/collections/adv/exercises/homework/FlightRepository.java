package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Tokio"));
        flights.add(new Flight("Miami", "New York"));
        flights.add(new Flight("Poznań", "Oslo"));
        flights.add(new Flight("Bratislava", "Kraków"));
        return flights;
    }
}
