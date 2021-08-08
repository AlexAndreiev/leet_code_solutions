package com.alex.andreiev.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStr_easy_28Test {

    @Test
    void strStr() {
        var target = new ImplementStrStr_easy_28();
        assertEquals(2, target.strStr("hello", "ll"));
        assertEquals(-1, target.strStr("aaaaa", "bba"));
        assertEquals(0, target.strStr("", ""));
        assertEquals(-1, target.strStr("", "a"));
        assertEquals(0, target.strStr("a", "a"));
    }
}