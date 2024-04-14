package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStrings_1071Test {

    @Test
    void gcdOfStrings() {
        var target = new GreatestCommonDivisorOfStrings_1071();
        assertEquals("ABC", target.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", target.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", target.gcdOfStrings("LEET", "CODE"));
    }
}