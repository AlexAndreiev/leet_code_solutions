package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefix_14Test {

    @Test
    void longestCommonPrefix() {
        var target = new LongestCommonPrefix_14();
        assertEquals("fl", target.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", target.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}