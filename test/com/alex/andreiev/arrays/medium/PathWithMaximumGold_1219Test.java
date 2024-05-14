package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathWithMaximumGold_1219Test {

    @Test
    void getMaximumGold() {
        var target = new PathWithMaximumGold_1219();
        assertEquals(24, target.getMaximumGold(new int[][]{
            {0,6,0},
            {5,8,7},
            {0,9,0}
        }));

        assertEquals(28, target.getMaximumGold(new int[][]{
            {1,0,7},
            {2,0,6},
            {3,4,5},
            {0,3,0},
            {9,0,20}
        }));

    }
}