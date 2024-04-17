package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequence_392Test {

    @Test
    void isSubsequence() {
        var target = new IsSubsequence_392();
        assertTrue(target.isSubsequence("abc", "ahbgdc"));
        assertFalse(target.isSubsequence("axc", "ahbgdc"));
        assertTrue(target.isSubsequence("", "ahbgdc"));
        assertTrue(target.isSubsequence("b", "abc"));
    }
}