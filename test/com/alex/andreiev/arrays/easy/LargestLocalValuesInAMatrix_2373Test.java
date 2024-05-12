package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestLocalValuesInAMatrix_2373Test {

    @Test
    void largestLocal() {
        var target = new LargestLocalValuesInAMatrix_2373();
        assertArrayEquals(new int [][] {{9, 9}, {8, 6}},
            target.largestLocal(new int[][]{
                {9,9,8,1},
                {5,6,2,6},
                {8,2,6,4},
                {6,2,2,2}
            }));

        assertArrayEquals(new int[][] {
            {2,2,2},
            {2,2,2},
            {2,2,2}
        }, target.largestLocal(new int[][]{
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,2,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1}
        }));
    }
}