package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int windows95;
    private int windows10;
    private int getWindows95;
    private int getWindows10;

    public OperatingSystem(int windows95, int windows10) {
        this.windows95 = windows95;
        this.windows10 = windows10;
    }

    public void turnOn() {
        System.out.println("Rok wydania win95 to " + windows95);
    }

    public void turnOff() {
        System.out.println("Rok wydania win10 to " + windows10);
    }

    public OperatingSystem() {
        System.out.println("Constryctor Windowsa");
    }

    public static int getWindows95() {
        return getWindows95();
    }

    public int getWindows10() {
        return getWindows10;
    }

    public void displayWin95Age() {
        System.out.println("Year Win95 is " + windows95);
    }

}
