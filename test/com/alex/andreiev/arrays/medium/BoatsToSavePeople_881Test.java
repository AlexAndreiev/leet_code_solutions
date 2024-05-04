package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsToSavePeople_881Test {

    @Test
    void numRescueBoats() {
        var target = new BoatsToSavePeople_881();
        assertEquals(1, target.numRescueBoats(new int[] {1, 2}, 3));
        assertEquals(3, target.numRescueBoats(new int[] {3, 2, 2, 1}, 3));
        assertEquals(4, target.numRescueBoats(new int[] {3, 5, 3, 4}, 5));
        assertEquals(3, target.numRescueBoats(new int[] {3, 2, 3, 2, 2}, 6));
    }
}