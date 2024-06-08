package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubarraySum_523Test {

    @Test
    void checkSubarraySum() {
        var target = new ContinuousSubarraySum_523();
        assertTrue(target.checkSubarraySum(new int[] {23,2,4,6,7}, 6));
        assertTrue(target.checkSubarraySum(new int[] {23,2,6,4,7}, 6));
        assertFalse(target.checkSubarraySum(new int[] {23,2,6,4,7}, 13));
    }
}