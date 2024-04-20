package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayI_643Test {

    @Test
    void findMaxAverage() {
        var target = new MaximumAverageSubarrayI_643();
        assertEquals(12.75, target.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        assertEquals(5, target.findMaxAverage(new int[] {5}, 1));
    }
}