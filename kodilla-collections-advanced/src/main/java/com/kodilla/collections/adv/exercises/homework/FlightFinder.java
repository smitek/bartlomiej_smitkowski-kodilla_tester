package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private static List<Flight> flights;

    public List<Flight> findFlightsFrom(String departure) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightsDeparture = new ArrayList<>();
        int flightCount = flights.size();
        for (int i = 0; i < flightCount; i++) {
            Flight flight = flights.get(i);
            if (flight.departure.equals(departure)) {
                flightsDeparture.add(flight);
            }
        }
        if (flightsDeparture.size() == 0) {
            return flightsDeparture = new ArrayList<>();
        }
        return flightsDeparture;
    }

    public List<Flight> findFligtsTo(String arrival) {
        flights = FlightRepository.getFlightTable();
        List<Flight> flightsArrival = new ArrayList<>();
        int flightCount = flights.size();
        for (int i = 0; i < flightCount; i++) {
            Flight flight = flights.get(i);
            if (flight.arrival.equals(arrival)) {
                flightsArrival.add(flight);
            }
        }
        if (flightsArrival.size() == 0) {
            return flightsArrival = new ArrayList<>();
        }
        return flightsArrival;
    }
}
