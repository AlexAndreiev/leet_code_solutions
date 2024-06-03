package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppendCharactersToStringToMakeSubsequence_2486Test {

    @Test
    void appendCharacters() {
        var target = new AppendCharactersToStringToMakeSubsequence_2486();
        assertEquals(4, target.appendCharacters("coaching", "coding"));
        assertEquals(0, target.appendCharacters("abcde", "a"));
        assertEquals(5, target.appendCharacters("z", "abcde"));
    }
}