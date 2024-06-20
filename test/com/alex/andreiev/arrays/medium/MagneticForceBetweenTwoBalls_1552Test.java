package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagneticForceBetweenTwoBalls_1552Test {

    @Test
    void maxDistance() {
        var target = new MagneticForceBetweenTwoBalls_1552();
        assertEquals(3, target.maxDistance(new int[] {1,2,3,4,7}, 2));
        assertEquals(999999999, target.maxDistance(new int[] {5,4,3,2,1,1000000000}, 2));
    }
}