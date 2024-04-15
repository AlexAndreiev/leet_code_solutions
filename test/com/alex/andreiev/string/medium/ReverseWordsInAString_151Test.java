package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAString_151Test {

    @Test
    void reverseWords() {
        var target = new ReverseWordsInAString_151();
        assertEquals("blue is sky the", target.reverseWords("the sky is blue"));
        assertEquals("world hello", target.reverseWords("   hello world  "));
        assertEquals("example good a", target.reverseWords("a good   example"));
    }
}