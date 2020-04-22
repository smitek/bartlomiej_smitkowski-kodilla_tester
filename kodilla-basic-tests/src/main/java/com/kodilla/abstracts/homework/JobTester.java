package com.kodilla.abstracts.homework;

public class JobTester extends Job{
    public double a;

    @Override
    double salary() {
        return a+1500;
    }

    @Override
    double responsibilities() {
        return 6000;
    }
}
