package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPO_502Test {

    @Test
    void findMaximizedCapital() {
        var target = new IPO_502();
        assertEquals(4, target.findMaximizedCapital(2, 0,
                new int[] { 1, 2, 3 }, new int[] { 0, 1, 1 }));

        assertEquals(6, target.findMaximizedCapital(3, 0,
                new int[] { 1, 2, 3 }, new int[] { 0, 1, 2 }));
    }
}