package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {
    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringGamblingMachine.csv", numLinesToSkip = 0)
    public void numbersFromCsv(String none, String ntwo, String nthere, String nfour) {
        //given
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<String> setOfString = new HashSet<>(Arrays.asList(none, ntwo, nthere, nfour));
        Set<Integer> setOfInteger = setOfString.stream()
                .map(Integer::parseInt).collect(Collectors.toSet());
        //when
        //then
        assertThrows(InvalidNumberException.class, () -> {
                    gamblingMachine.howManyWins(setOfInteger);
                }
        );
    }
}