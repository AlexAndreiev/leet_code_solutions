package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheNumberPfBeautifulSubsets_2597Test {

    @Test
    void beautifulSubsets() {
        var target = new TheNumberPfBeautifulSubsets_2597();
        assertEquals(4, target.beautifulSubsets(new int[] {2, 4, 6}, 2));

        assertEquals(1, target.beautifulSubsets(new int[] {1}, 1));
    }
}