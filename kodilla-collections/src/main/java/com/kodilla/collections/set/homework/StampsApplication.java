package com.kodilla.collections.set.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Drzewa", 43, 31,"Tak"));
        stamps.add(new Stamp("Koty", 45,45, "Nie"));
        stamps.add(new Stamp("Psy",43,39,"Nie"));
        stamps.add(new Stamp("Ryby", 35, 38, "Tak"));
        stamps.add(new Stamp("Koty", 45,45, "Nie"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
