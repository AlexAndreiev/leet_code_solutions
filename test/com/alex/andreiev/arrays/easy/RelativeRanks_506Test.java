package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeRanks_506Test {

    @Test
    void findRelativeRanks() {
        var target = new RelativeRanks_506();
        assertArrayEquals(new String[] {"Gold Medal","Silver Medal","Bronze Medal","4","5"},
            target.findRelativeRanks(new int[] {5,4,3,2,1}));

        assertArrayEquals(new String[] {"Gold Medal","5","Bronze Medal","Silver Medal","4"},
            target.findRelativeRanks(new int[] {10,3,8,9,4}));
    }
}