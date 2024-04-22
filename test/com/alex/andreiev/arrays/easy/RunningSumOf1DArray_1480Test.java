package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1DArray_1480Test {

    @Test
    void runningSum() {
        var target = new RunningSumOf1DArray_1480();
        assertArrayEquals(new int[] {1, 3, 6, 10}, target.runningSum(new int[] {1, 2, 3, 4}));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, target.runningSum(new int[] {1, 1, 1, 1, 1}));
        assertArrayEquals(new int[] {3, 4, 6, 16, 17}, target.runningSum(new int[] {3, 1, 2, 10, 1}));
    }
}