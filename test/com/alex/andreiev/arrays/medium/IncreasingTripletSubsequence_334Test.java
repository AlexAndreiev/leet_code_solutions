package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequence_334Test {

    @Test
    void increasingTriplet() {
        var target = new IncreasingTripletSubsequence_334();
        assertTrue(target.increasingTriplet(new int[] {1, 2, 3, 4, 5}));
        assertFalse(target.increasingTriplet(new int[] {5, 4, 3, 2, 1}));
        assertTrue(target.increasingTriplet(new int[] {2, 1, 5, 0, 4, 6}));
        assertFalse(target.increasingTriplet(new int[] {0, 4, 2, 1, 0, -1, -3}));
    }
}