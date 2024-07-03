package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDifferenceBetweenLargestAndSmallestValuesInTheeMoves_1509Test {

    @Test
    void minDifference() {
        var target = new MinimumDifferenceBetweenLargestAndSmallestValuesInTheeMoves_1509();
//        assertEquals(0, target.minDifference(new int[]{5,3,2,4}));
        assertEquals(1, target.minDifference(new int[]{1,5,0,10,14}));
//        assertEquals(0, target.minDifference(new int[]{3,100,20}));
    }
}