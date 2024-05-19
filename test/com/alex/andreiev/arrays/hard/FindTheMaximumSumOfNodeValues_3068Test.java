package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMaximumSumOfNodeValues_3068Test {

    @Test
    void maximumValueSum() {
        var target = new FindTheMaximumSumOfNodeValues_3068();
        assertEquals(6, target.maximumValueSum(new int[] {1, 2, 1}, 3, new int[][]{
            {0, 1},
            {0, 2}
        }));

        assertEquals(9, target.maximumValueSum(new int[] {2, 3}, 7, new int[][]{
            {0, 1}
        }));

        assertEquals(42, target.maximumValueSum(new int[] {7, 7, 7, 7, 7, 7},
            3, new int[][]{
                {0, 1},
                {0, 2},
                {0, 3},
                {0, 4},
                {0, 5}
        }));
    }
}