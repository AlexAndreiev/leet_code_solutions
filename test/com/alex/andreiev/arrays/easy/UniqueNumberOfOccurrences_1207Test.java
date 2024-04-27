package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrences_1207Test {

    @Test
    void uniqueOccurrences() {
        var target = new UniqueNumberOfOccurrences_1207();
        assertTrue(target.uniqueOccurrences(new int[] {1, 2, 2, 1, 1, 3}));
        assertFalse(target.uniqueOccurrences(new int[] {1, 2}));
        assertTrue(target.uniqueOccurrences(new int[] {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}