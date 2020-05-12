package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {

    public static String arrival;
    public String departure;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        Flight.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}
