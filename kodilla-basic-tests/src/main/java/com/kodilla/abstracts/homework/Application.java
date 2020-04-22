package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args){
        Kwadrat dlugosck = new Kwadrat();
        dlugosck.a = 10;
        System.out.println("Pole K = " + dlugosck.pole());
        System.out.println("Obwod K = " + dlugosck.obwod());

        Prostokat dlugoscp = new Prostokat();
        dlugoscp.a = 5;
        dlugoscp.b = 10;
        System.out.println("Pole P = " + dlugoscp.pole());
        System.out.println("Obwod P = " + dlugoscp.obwod());
    }
}
