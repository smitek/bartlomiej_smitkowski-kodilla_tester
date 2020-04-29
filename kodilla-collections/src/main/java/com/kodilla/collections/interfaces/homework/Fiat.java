package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    private double kmh;

    public Fiat(double kmh){
        this.kmh = kmh;
    }
    @Override
    public int getSpeed() {
        return (int) (kmh * 4);
    }

    @Override
    public double increaseSpeed() {
        return kmh + 77;
    }

    @Override
    public double decreaseSpeed() {
        return kmh / 3;
    }
}
