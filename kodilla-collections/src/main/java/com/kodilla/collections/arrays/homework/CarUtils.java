package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {
    public static void displayCarInfo(Car car) {
        System.out.println("---------");
        System.out.println("Car Kind " + describeCar(car));
        System.out.println("Car Speed" + car.getSpeed());
    }
    public static String describeCar(Car car) {
    if (car instanceof Ford)
        return "Ford";
    else if (car instanceof Audi)
        return "Audi";
    else if (car instanceof Fiat)
        return "Fiat";
    else
        return "Unkown car";
    }
    }

