package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequence_300Test {

    @Test
    void lengthOfLIS() {
        var target = new LongestIncreasingSubsequence_300();
        assertEquals(4, target.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
        assertEquals(4, target.lengthOfLIS(new int[] {0,1,0,3,2,3}));
        assertEquals(1, target.lengthOfLIS(new int[] {7,7,7,7,7,7,7}));
    }
}