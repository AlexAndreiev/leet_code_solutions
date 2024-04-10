package com.alex.andreiev.string;

import com.alex.andreiev.arrays.SearchInsertPosition_easy_35;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWord_easy_58Test {

    @Test
    void lengthOfLastWord() {
        var target = new LengthOfLastWord_easy_58();
        assertEquals(5, target.lengthOfLastWord("Hello World"));
        assertEquals(4, target.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, target.lengthOfLastWord("luffy is still joyboy"));
        assertEquals(1, target.lengthOfLastWord("a"));
    }
}