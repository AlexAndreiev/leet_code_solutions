package com.alex.andreiev.math.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquareNumbers_633Test {

    @Test
    void judgeSquareSum() {
        var target = new SumOfSquareNumbers_633();
        assertTrue(target.judgeSquareSum(5));
        assertFalse(target.judgeSquareSum(3));
        assertTrue(target.judgeSquareSum(2));
        assertTrue(target.judgeSquareSum(1));
        assertTrue(target.judgeSquareSum(100000));
        assertFalse(target.judgeSquareSum(2147483646));
    }
}