package com.kodilla.inheritance.homework;

public class OperatingSystem_0 extends OperatingSystem {


    public OperatingSystem_0(int windows95, int windows10) {
        super(windows95, windows10);
    }

    public OperatingSystem_0() {

    }

    public void openCD(){
        System.out.println("Open CD ...");
    }
    public void closeCD(){
        System.out.println("Close CD ...");
    }
    public void OperatingSystem_0(){
        System.out.println("Czekam na CD z Ubuntu.");
    }
    @Override
    public void turnOff(){
        System.out.println("Windows10 to dobry system.");
    }


//    public static void main(String[] args){
//        OperatingSystem operatingSystem = new OperatingSystem (1995, 2015);
//        operatingSystem.turnOn();
//        operatingSystem.turnOff();
//    }
}
