package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfDaysToMakeMBouquets_1482Test {

    @Test
    void minDays() {
        var target = new MinimumNumberOfDaysToMakeMBouquets_1482();
        assertEquals(3, target.minDays(new int[] {1,10,3,10,2}, 3, 1));
        assertEquals(-1, target.minDays(new int[] {1,10,3,10,2}, 3, 2));
        assertEquals(12, target.minDays(new int[] {7,7,7,7,12,7,7}, 2, 3));
    }
}