package com.kodilla.collections.adv.exercises.dictonary;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindToKos(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFligtsTo("KOS");
        //then
        assertEquals("KOS", Flight.arrival);
    }

    @Test
    public void testFindToMun(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> foundFlights = flightFinder.findFligtsTo("MUN");
        //then
        assertEquals("MUN", Flight.arrival);

    }

}
