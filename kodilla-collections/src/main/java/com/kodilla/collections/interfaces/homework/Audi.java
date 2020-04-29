package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private double kmh;

    public Audi(double kmh){
        this.kmh = kmh;
    }
    @Override
    public int getSpeed() {
        return (int) (kmh + 34);
    }

    @Override
    public double increaseSpeed() {
        return kmh * 2.66;
    }

    @Override
    public double decreaseSpeed() {
        return kmh * 0.23 ;
    }
}
