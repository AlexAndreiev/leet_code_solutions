package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixOfWord_2000Test {

    @Test
    void reversePrefix() {
        var target = new ReversePrefixOfWord_2000();
        assertEquals("dcbaefd", target.reversePrefix("abcdefd", 'd'));
        assertEquals("zxyxxe", target.reversePrefix("xyxzxe", 'z'));
        assertEquals("abcd", target.reversePrefix("abcd", 'z'));
    }
}