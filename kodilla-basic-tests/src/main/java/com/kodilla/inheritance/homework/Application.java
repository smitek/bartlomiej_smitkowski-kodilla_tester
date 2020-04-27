package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(1995, 2015);
        operatingSystem.turnOn();

        OperatingSystem_0 operatingSystem_0 = new OperatingSystem_0(1992,2010);
        operatingSystem_0.turnOff();
        operatingSystem_0.displayWin95Age();

        System.out.println(OperatingSystem_0.getWindows95());

    }
}
