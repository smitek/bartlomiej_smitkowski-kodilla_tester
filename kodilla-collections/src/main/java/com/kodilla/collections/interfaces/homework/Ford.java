package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private double kmh;

    public Ford(double kmh){
        this.kmh = kmh;
    }
    @Override
    public int getSpeed(){
        return (int) kmh;
    }
    @Override
    public double increaseSpeed(){
        return kmh * 2;
    }
    @Override
    public double decreaseSpeed(){
        return kmh / 2;
    }

}
