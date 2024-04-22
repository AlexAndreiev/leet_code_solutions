package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnes3_1004Test {

    @Test
    void longestOnes() {
        var target = new MaxConsecutiveOnes3_1004();
        assertEquals(6, target.longestOnes(
            new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));

        assertEquals(10, target.longestOnes(
            new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}