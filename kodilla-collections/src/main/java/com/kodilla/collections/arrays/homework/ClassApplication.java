package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;


public class ClassApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[16];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(16);
        double a = random.nextDouble() * 60 + 1;
        double b = random.nextDouble() * 60 + 1;
        double c = random.nextDouble() * 60 + 1;
        double d = random.nextDouble() * 60 + 1;
        double e = random.nextDouble() * 60 + 1;
        double f = random.nextDouble() * 60 + 1;
        double g = random.nextDouble() * 60 + 1;
        double h = random.nextDouble() * 60 + 1;
        double i = random.nextDouble() * 60 + 1;
        double j = random.nextDouble() * 60 + 1;
        double k = random.nextDouble() * 60 + 1;
        double l = random.nextDouble() * 60 + 1;
        double m = random.nextDouble() * 60 + 1;
        double n = random.nextDouble() * 60 + 1;
        double o = random.nextDouble() * 60 + 1;
        if (drawCarKind == 0) {
            return new Ford(a);
        } else if (drawCarKind == 1) {
            return new Audi(b);
        } else
            return new Fiat(c);
        //       public static Car drawCar ()
    }
}

