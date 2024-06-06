package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandOfStraights_846Test {

    @Test
    void isNStraightHand() {
        var target = new HandOfStraights_846();
        assertTrue(target.isNStraightHand(new int[] {1,2,3,6,2,3,4,7,8}, 3));
        assertFalse(target.isNStraightHand(new int[] {1,2,3,4,5}, 4));
        assertFalse(target.isNStraightHand(new int[] {4,3,3,4,1,2,2,4}, 4));
    }
}