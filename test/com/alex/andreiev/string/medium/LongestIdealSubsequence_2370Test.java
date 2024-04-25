package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIdealSubsequence_2370Test {

    @Test
    void longestIdealString() {
        var target = new LongestIdealSubsequence_2370();
        assertEquals(4, target.longestIdealString("acfgbd", 2));
//        assertEquals(4, target.longestIdealString("abcd", 3));
//        assertEquals(5, target.longestIdealString("eduktdb", 15));
//        assertEquals(7, target.longestIdealString("lkpkxcigcs", 6));

    }
}