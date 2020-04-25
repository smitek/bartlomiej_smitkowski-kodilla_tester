package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 2;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.sub(a, b);
        int powResult = calculator.pow(a, c);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa dla " + a + " i " + b);
        }
        else {
            System.out.println("Metoda sun nie działa dla " + a + " i " + b);
        }

        boolean correctsub = ResultChecker.assertEquals(-3, subResult);
        if (correctsub){
            System.out.println("Metoda sub działa dla " + a + " i " + b);
        }
        else {
            System.out.println("Metoda sum nie działa dla " + a + " i " + b);
        }

        boolean correctpow = ResultChecker.assertEquals(25, powResult);
        if (correctpow){
            System.out.println("Metoda pow działa dla " + a + " i " + c);
        }
        else {
            System.out.println("Metoda pow nie działa dla " + a + " i " + c);
        }

    }
}
