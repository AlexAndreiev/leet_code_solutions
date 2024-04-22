package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceANumberToZero_1342Test {

    @Test
    void numberOfSteps() {
        var target = new NumberOfStepsToReduceANumberToZero_1342();
        assertEquals(6, target.numberOfSteps(14));
        assertEquals(4, target.numberOfSteps(8));
        assertEquals(12, target.numberOfSteps(123));
    }
}