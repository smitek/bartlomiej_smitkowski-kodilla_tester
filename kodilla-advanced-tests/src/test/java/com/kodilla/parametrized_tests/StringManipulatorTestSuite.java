package com.kodilla.parametrized_tests;

import com.sun.jdi.Value;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.*;

public class StringManipulatorTestSuite {
    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void ShouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, manipulator.rewerseWithLowerCase(input));
    }
}