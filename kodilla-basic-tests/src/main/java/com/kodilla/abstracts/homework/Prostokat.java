package com.kodilla.abstracts.homework;

public class Prostokat extends Shape {
    public double a,b;

    public double pole(){
        return a*b;
    }
    public double obwod(){
        return 2*a + 2*b;
    }
}
