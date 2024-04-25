package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPivotIndex_724Test {

    @Test
    void pivotIndex() {
        var target = new FindPivotIndex_724();
        assertEquals(3, target.pivotIndex(new int[] {1,7,3,6,5,6}));
        assertEquals(-1, target.pivotIndex(new int[] {1,2,2}));
        assertEquals(0, target.pivotIndex(new int[] {2,1,-1}));
    }
}