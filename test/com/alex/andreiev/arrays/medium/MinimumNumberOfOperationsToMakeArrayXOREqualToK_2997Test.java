package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToMakeArrayXOREqualToK_2997Test {

    @Test
    void minOperations() {
        var target = new MinimumNumberOfOperationsToMakeArrayXOREqualToK_2997();
        assertEquals(2, target.minOperations(new int[] {2, 1, 3, 4}, 1));
        assertEquals(0, target.minOperations(new int[] {2, 0, 2, 0}, 0));
    }
}