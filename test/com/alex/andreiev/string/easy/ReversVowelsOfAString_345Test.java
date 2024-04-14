package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversVowelsOfAString_345Test {

    @Test
    void reverseVowels() {
        var target = new ReversVowelsOfAString_345();
        assertEquals("holle", target.reverseVowels("hello"));
        assertEquals("leotcede", target.reverseVowels("leetcode"));
    }
}