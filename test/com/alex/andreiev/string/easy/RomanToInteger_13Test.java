package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToInteger_13Test {

    @Test
    void romanToInt() {
        var target = new RomanToInteger_13();
        assertEquals(3, target.romanToInt("III"));
        assertEquals(4, target.romanToInt("IV"));
        assertEquals(9, target.romanToInt("IX"));
        assertEquals(58, target.romanToInt("LVIII"));
        assertEquals(1994, target.romanToInt("MCMXCIV"));
    }
}