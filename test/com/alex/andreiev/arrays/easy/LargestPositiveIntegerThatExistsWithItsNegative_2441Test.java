package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPositiveIntegerThatExistsWithItsNegative_2441Test {

    @Test
    void findMaxK() {
        var target = new LargestPositiveIntegerThatExistsWithItsNegative_2441();
        assertEquals(3, target.findMaxK(new int[] {-1, 2, -3, 3}));
        assertEquals(7, target.findMaxK(new int[] {-1, 10, 6, 7, -7, 1}));
        assertEquals(-1, target.findMaxK(new int[] {-10, 8, 6, 7, -2, -3}));
    }
}