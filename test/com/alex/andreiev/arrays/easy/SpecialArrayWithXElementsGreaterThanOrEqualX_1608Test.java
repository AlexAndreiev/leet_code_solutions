package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayWithXElementsGreaterThanOrEqualX_1608Test {

    @Test
    void specialArray() {
        var target = new SpecialArrayWithXElementsGreaterThanOrEqualX_1608();
//        assertEquals(2, target.specialArray(new int[]{3, 5}));
//        assertEquals(-1, target.specialArray(new int[]{0, 0}));
        assertEquals(3, target.specialArray(new int[]{0, 4, 3, 0, 4}));
    }
}