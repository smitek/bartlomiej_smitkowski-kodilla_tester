package com.kodilla.basic_assertion;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals (14, sumResult);
    }

}
