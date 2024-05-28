package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetEqualSubstringsWithinBudget_1208Test {

    @Test
    void equalSubstring() {
        var target = new GetEqualSubstringsWithinBudget_1208();
        assertEquals(3, target.equalSubstring("abcd", "bcdf", 3));
        assertEquals(1, target.equalSubstring("abcd", "cdef", 3));
        assertEquals(1, target.equalSubstring("abcd", "acde", 0));
        assertEquals(2, target.equalSubstring("krrgw", "zjxss", 19));
    }
}