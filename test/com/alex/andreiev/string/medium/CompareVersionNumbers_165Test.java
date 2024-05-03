package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareVersionNumbers_165Test {

    @Test
    void compareVersion() {
        var target = new CompareVersionNumbers_165();
        assertEquals(0, target.compareVersion("1.01", "1.001"));
        assertEquals(0, target.compareVersion("1.0", "1.0.0"));
        assertEquals(-1, target.compareVersion("0.1", "1.1"));
    }
}