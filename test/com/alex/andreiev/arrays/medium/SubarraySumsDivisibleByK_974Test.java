package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumsDivisibleByK_974Test {

    @Test
    void subarraysDivByK() {
        var target = new SubarraySumsDivisibleByK_974();
        assertEquals(7, target.subarraysDivByK(new int[] {4,5,0,-2,-3,1}, 5));
        assertEquals(0, target.subarraysDivByK(new int[] {5}, 9));
    }
}