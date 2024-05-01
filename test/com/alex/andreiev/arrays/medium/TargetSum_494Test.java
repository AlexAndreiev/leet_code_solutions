package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSum_494Test {

    @Test
    void findTargetSumWays() {
        var target = new TargetSum_494();
        assertEquals(5, target.findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3));
        assertEquals(1, target.findTargetSumWays(new int[] {1}, 1));
    }
}