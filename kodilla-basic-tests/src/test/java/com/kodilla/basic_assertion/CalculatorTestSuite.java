package com.kodilla.basic_assertion;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        int c = 5;
        double powResult = calculator.pow(c);
        assertEquals(25, powResult);
    }

}
