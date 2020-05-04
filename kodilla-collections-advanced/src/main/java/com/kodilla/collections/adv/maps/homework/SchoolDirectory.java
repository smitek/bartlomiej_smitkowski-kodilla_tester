package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> classs = new HashMap<>();
        Principal stefan = new Principal("Stefan");
        Principal adam = new Principal("Adam");
        Principal boleslaw = new Principal("Bolesław");
        Principal henryk = new Principal("Henryk");

        School stefanSchools = new School(31.0, 32.0, 25, 43, 22);
        School adamSchools = new School(21, 33, 23, 22, 41);
        School boleslawSchools = new School(21, 22, 11, 15, 14, 11);
        School henrykSchools = new School(33, 44, 44, 22, 19);

        classs.put(stefan, stefanSchools);
        classs.put(adam, adamSchools);
        classs.put(boleslaw, boleslawSchools);
        classs.put(henryk, henrykSchools);

        for (Map.Entry<Principal, School> principalEntry : classs.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " posiada w swojej szkole: " + principalEntry.getValue().getNumber() + " uczniów.");

    }
}
