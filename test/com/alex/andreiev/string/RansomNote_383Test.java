package com.alex.andreiev.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNote_383Test {

    @Test
    void canConstruct() {
        var target = new RansomNote_383();
        assertFalse(target.canConstruct("a", "b"));
        assertFalse(target.canConstruct("aa", "ab"));
        assertTrue(target.canConstruct("aa", "aab"));
    }
}