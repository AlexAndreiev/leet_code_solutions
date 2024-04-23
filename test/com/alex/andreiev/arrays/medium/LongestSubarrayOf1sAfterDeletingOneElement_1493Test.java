package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayOf1sAfterDeletingOneElement_1493Test {

    @Test
    void longestSubarray() {
        var target = new LongestSubarrayOf1sAfterDeletingOneElement_1493();
        assertEquals(3, target.longestSubarray(new int[] {1, 1, 0, 1}));
        assertEquals(5, target.longestSubarray(new int[] {0, 1, 1, 1, 0, 1, 1, 0, 1}));
        assertEquals(1, target.longestSubarray(new int[] {1, 1}));
    }
}