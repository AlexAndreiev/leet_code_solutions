package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervals_435Test {

    @Test
    void eraseOverlapIntervals() {
        var target = new NonOverlappingIntervals_435();
        assertEquals(1, target.eraseOverlapIntervals(new int[][]{
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 3}
        }));

        assertEquals(2, target.eraseOverlapIntervals(new int[][]{
            {1, 2},
            {1, 2},
            {1, 2}
        }));

        assertEquals(0, target.eraseOverlapIntervals(new int[][]{
            {1, 2},
            {2, 3}
        }));

        assertEquals(0, target.eraseOverlapIntervals(new int[][]{
            {1, 2},
            {2, 3},
            {3, 4},
            {-100, -2},
            {5, 7}
        }));
    }
}