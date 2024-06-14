package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIncrementToMakeArrayUnique_945Test {

    @Test
    void minIncrementForUnique() {
        var target = new MinimumIncrementToMakeArrayUnique_945();
        assertEquals(1, target.minIncrementForUnique(new int[]{1, 2, 2}));
        assertEquals(6, target.minIncrementForUnique(new int[]{3,2,1,2,1,7}));
    }
}