package com.kodilla.abstracts.homework;

public class JobDriver extends Job{
    public double a;
    @Override
    double salary() {
        return a;
    }

    @Override
    double responsibilities() {
        return a+900;
    }
}
