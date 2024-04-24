package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitude_1732Test {

    @Test
    void largestAltitude() {
        var target = new FindTheHighestAltitude_1732();
        assertEquals(1, target.largestAltitude(new int[] {-5,1,5,0,-7}));
        assertEquals(0, target.largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
    }
}