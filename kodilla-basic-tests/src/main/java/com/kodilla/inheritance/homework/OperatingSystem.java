package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int windows95;
    private int windows10;

    public void turnOn() {
        System.out.println("Rok wydania win95 to " + windows95);
    }

    public void turnOff() {
        System.out.println("Rok wydania win10 to " + windows10);
    }

    public OperatingSystem(int windows95, int windows10) {
        this.windows95 = windows95;
        this.windows10 = windows10;
    }
//    @Override
    public void openCD() {
        System.out.println("Czekam na dysk instalacyjny Ubuntu");
    }
}
