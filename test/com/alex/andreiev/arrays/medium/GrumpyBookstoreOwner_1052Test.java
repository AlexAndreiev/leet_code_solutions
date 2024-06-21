package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrumpyBookstoreOwner_1052Test {

    @Test
    void maxSatisfied() {
        var target = new GrumpyBookstoreOwner_1052();
        assertEquals(16, target.maxSatisfied(new int[]{1,0,1,2,1,1,7,5},
                new int[]{0,1,0,1,0,1,0,1}, 3));

        assertEquals(1, target.maxSatisfied(new int[]{1}, new int[]{0}, 1));

        assertEquals(17, target.maxSatisfied(new int[]{2,6,6,9}, new int[]{0,0,1,1}, 1));
    }
}