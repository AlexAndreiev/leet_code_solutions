package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowers_605Test {

    @Test
    void canPlaceFlowers() {
        var target = new CanPlaceFlowers_605();
        assertTrue(target.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 1));
        assertFalse(target.canPlaceFlowers(new int[] {1, 0, 0, 0, 1}, 2));
    }
}