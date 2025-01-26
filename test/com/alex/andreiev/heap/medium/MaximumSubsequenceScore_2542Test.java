package com.alex.andreiev.heap.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubsequenceScore_2542Test {

    @Test
    void maxScore() {
        var target = new MaximumSubsequenceScore_2542();
        assertEquals(12, target.maxScore(new int[] {1,3,3,2}, new int[] {2,1,3,4}, 3));
        assertEquals(30, target.maxScore(new int[] {4,2,3,1,1}, new int[] {7,5,10,9,6}, 1));

    }
}