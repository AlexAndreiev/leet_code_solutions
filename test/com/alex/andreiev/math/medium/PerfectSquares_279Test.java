package com.alex.andreiev.math.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquares_279Test {

    @Test
    void numSquares() {
        var target = new PerfectSquares_279();
        assertEquals(3, target.numSquares(12));
        assertEquals(2, target.numSquares(13));
        assertEquals(3, target.numSquares(43));
    }
}