package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelativeSortArray_1122Test {

    @Test
    void relativeSortArray() {
        var target = new RelativeSortArray_1122();
        assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19},
            target.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},
                new int[] {2,1,4,3,9,6}));

        assertArrayEquals(new int[] {22,28,8,6,17,44},
            target.relativeSortArray(new int[]{28,6,22,8,44,17},
                new int[] {22,28,8,6}));
    }
}