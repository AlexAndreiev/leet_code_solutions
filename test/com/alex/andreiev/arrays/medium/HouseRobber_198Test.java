package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber_198Test {

    @Test
    void rob() {
        var target = new HouseRobber_198();
        assertEquals(4, target.rob(new int[] {1, 2, 3, 1}));
        assertEquals(12, target.rob(new int[] {2, 7, 9, 3, 1}));
    }
}