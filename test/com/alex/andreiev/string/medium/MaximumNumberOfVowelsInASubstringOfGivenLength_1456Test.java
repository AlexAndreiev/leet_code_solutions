package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsInASubstringOfGivenLength_1456Test {

    @Test
    void maxVowels() {
        var target = new MaximumNumberOfVowelsInASubstringOfGivenLength_1456();
        assertEquals(3, target.maxVowels("abciiidef", 3));
        assertEquals(2, target.maxVowels("aeiou", 2));
        assertEquals(2, target.maxVowels("leetcode", 3));
    }
}