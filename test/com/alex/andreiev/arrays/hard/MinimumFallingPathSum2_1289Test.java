package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSum2_1289Test {

    @Test
    void minFallingPathSum() {
        var target = new MinimumFallingPathSum2_1289();
        var input = new int[][] {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        assertEquals(13, target.minFallingPathSum(input));

        assertEquals(7, target.minFallingPathSum(new int[][]{
            {7}
        }));
    }
}