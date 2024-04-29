package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualRowAndColumnPairs_2352Test {

    @Test
    void equalPairs() {
        var target = new EqualRowAndColumnPairs_2352();
        assertEquals(1, target.equalPairs(new int[][]{
            {3,2,1},
            {1,7,6},
            {2,7,7}
        }));

        assertEquals(3, target.equalPairs(new int[][]{
            {3,1,2,2},
            {1,4,4,5},
            {2,4,2,2},
            {2,4,2,2}
        }));
    }
}