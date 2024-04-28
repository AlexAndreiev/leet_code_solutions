package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfTwoStringsAreClose_1657Test {

    @Test
    void closeStrings() {
        var target = new DetermineIfTwoStringsAreClose_1657();
        assertTrue(target.closeStrings("abc", "bca"));
        assertFalse(target.closeStrings("a", "aa"));
        assertTrue(target.closeStrings("cabbba", "abbccc"));
    }
}