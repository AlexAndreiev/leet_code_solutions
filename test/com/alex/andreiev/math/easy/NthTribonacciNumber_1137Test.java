package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumber_1137Test {

    @Test
    void tribonacci() {
        var target = new NthTribonacciNumber_1137();
        assertEquals(4, target.tribonacci (4));
        assertEquals(1389537, target.tribonacci (25));
    }
}