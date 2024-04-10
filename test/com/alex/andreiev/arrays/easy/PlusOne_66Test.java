package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOne_66Test {

    @Test
    void plusOne() {
        var target = new PlusOne_66();
        // The array represents the integer 123.
        assertArrayEquals(new int[]{1, 2, 4}, target.plusOne(new int[] {1, 2, 3}));

        // The array represents the integer 4321.
        assertArrayEquals(new int[]{4,3,2,2}, target.plusOne(new int[] {4,3,2,1}));
        assertArrayEquals(new int[]{1}, target.plusOne(new int[] {0}));
    }
}