package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairs_746Test {

    @Test
    void minCostClimbingStairs() {
        var target = new MinCostClimbingStairs_746();
        assertEquals(15, target.minCostClimbingStairs(new int[] {0,15,20}));
        assertEquals(6, target.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
}