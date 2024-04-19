package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfKSumPairs_1679Test {

    @Test
    void maxOperations() {
        var target = new MaxNumberOfKSumPairs_1679();
        assertEquals(2, target.maxOperations(new int[] {1,2,3,4}, 5));
        assertEquals(1, target.maxOperations(new int[] {3,1,3,4,3}, 6));
        assertEquals(4, target.maxOperations(new int[] {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3));
    }
}