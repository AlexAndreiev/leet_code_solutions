package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumOfSortedSubarraySums_1508Test {

    @Test
    void rangeSum() {
        var target = new RangeSumOfSortedSubarraySums_1508();
        assertEquals(13, target.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
        assertEquals(6, target.rangeSum(new int[]{1, 2, 3, 4}, 4, 3, 4));
        assertEquals(50, target.rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 10));
    }
}