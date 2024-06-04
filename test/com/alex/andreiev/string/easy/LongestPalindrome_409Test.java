package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindrome_409Test {

    @Test
    void longestPalindrome() {
        var target = new LongestPalindrome_409();
        assertEquals(7, target.longestPalindrome("abccccdd"));
        assertEquals(1, target.longestPalindrome("a"));
    }
}