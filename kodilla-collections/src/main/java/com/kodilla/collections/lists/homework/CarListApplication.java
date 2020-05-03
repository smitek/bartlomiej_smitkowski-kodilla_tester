package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(145));
        cars.add(new Ford(100));
        cars.add(new Ford(77));
        cars.add(new Audi(175));
        cars.add(new Audi(145));
        cars.add(new Audi(99));
        cars.add(new Fiat(75));
        cars.add(new Fiat(45));
        cars.add(new Fiat(67));

        for (Car ford : cars) {
            if (ford.getSpeed() > 99)
                System.out.println(ford + " speed " + ford.getSpeed());
        }
    }
}

