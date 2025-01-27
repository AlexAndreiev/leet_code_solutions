package com.alex.andreiev.binary.search.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElement_162Test {

    @Test
    void findPeakElement() {
        var target = new FindPeakElement_162();
        assertEquals(2, target.findPeakElement(new int[]{1, 2, 3, 1}));

        assertEquals(5, target.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}