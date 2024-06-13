package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfMovesToSeatEveryone_2037Test {

    @Test
    void minMovesToSeat() {
        var target = new MinimumNumberOfMovesToSeatEveryone_2037();
        assertEquals(4, target.minMovesToSeat(new int[] {3, 1, 5}, new int[] {2, 7, 4}));

        assertEquals(7, target.minMovesToSeat(new int[] {4,1,5,9}, new int[] {1,3,2,6}));
    }
}