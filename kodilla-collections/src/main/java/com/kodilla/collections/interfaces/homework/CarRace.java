package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (99);
        doRace(ford);

        Audi audi = new Audi(150);
        doRace(audi);

        Fiat fiat = new Fiat(50);
        doRace(fiat);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }
}
