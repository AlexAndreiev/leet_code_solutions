package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTripletsThatCanFormTwoArraysOfEqualXor_1442Test {
    @Test
    public void countTriplets() {
        var target = new CountTripletsThatCanFormTwoArraysOfEqualXor_1442();
        assertEquals(4, target.countTriplets(new int[] {2, 3, 1, 6, 7}));
        assertEquals(10, target.countTriplets(new int[] {1, 1, 1, 1, 1}));
    }
}