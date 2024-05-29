package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersOfStepsToReduceANumberInBinaryRepresentationToOne_1404Test {

    @Test
    void numSteps() {
        var target = new NumbersOfStepsToReduceANumberInBinaryRepresentationToOne_1404();
        assertEquals(6, target.numSteps("1101"));
        assertEquals(1, target.numSteps("10"));
        assertEquals(0, target.numSteps("1"));
        assertEquals(85, target.numSteps(
            "1111011110000011100000110001011011110010111001010111110001"));
    }
}