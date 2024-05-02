package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeString_394Test {

    @Test
    void decodeString() {
        var target = new DecodeString_394();
        assertEquals("aaabcbc", target.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", target.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", target.decodeString("2[abc]3[cd]ef"));
    }
}