package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWord_58Test {

    @Test
    void lengthOfLastWord() {
        var target = new LengthOfLastWord_58();
        assertEquals(5, target.lengthOfLastWord("Hello World"));
        assertEquals(4, target.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, target.lengthOfLastWord("luffy is still joyboy"));
        assertEquals(1, target.lengthOfLastWord("a"));
    }
}