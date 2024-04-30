package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWonderfulSubstrings_1915Test {

    @Test
    void wonderfulSubstrings() {
        var target = new NumberOfWonderfulSubstrings_1915();
        assertEquals(4, target.wonderfulSubstrings("aba"));
        assertEquals(9, target.wonderfulSubstrings("aabb"));
        assertEquals(2, target.wonderfulSubstrings("he"));
    }
}