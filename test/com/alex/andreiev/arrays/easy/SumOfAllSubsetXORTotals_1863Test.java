package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllSubsetXORTotals_1863Test {

    @Test
    void subsetXORSum() {
        var target = new SumOfAllSubsetXORTotals_1863();
        assertEquals(6, target.subsetXORSum(new int[] {1, 3}));
        assertEquals(28, target.subsetXORSum(new int[] {5, 1,6}));
        assertEquals(480, target.subsetXORSum(new int[] {3, 4, 5, 6, 7, 8}));
    }
}