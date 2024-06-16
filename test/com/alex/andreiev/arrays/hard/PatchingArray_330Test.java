package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatchingArray_330Test {

    @Test
    void minPatches() {
        var target = new PatchingArray_330();
//        assertEquals(1, target.minPatches(new int[]{1, 3}, 6));
        assertEquals(2, target.minPatches(new int[]{1, 5, 10}, 20));
        assertEquals(0, target.minPatches(new int[]{1, 2, 2}, 5));
    }
}