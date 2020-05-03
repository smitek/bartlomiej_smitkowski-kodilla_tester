package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.LinkedList;
import java.util.List;

public class CarUtils {
    public static void main(String[] args) {
        List<Car> describeCar = new LinkedList<>();
        describeCar.add(new Ford(65));
        describeCar.add(new Audi(123));
        Car fiat = new Fiat(75);
        describeCar.add(fiat);

        describeCar.remove(0);
        describeCar.remove(fiat);

        System.out.println("został " + describeCar.size());

    }
}
