package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharacters_3Test {

    @Test
    void lengthOfLongestSubstring() {
        var target = new LongestSubstringWithoutRepeatingCharacters_3();
        assertEquals(2, target.lengthOfLongestSubstring("abba"));
        assertEquals(2, target.lengthOfLongestSubstring("cdd"));
        assertEquals(1, target.lengthOfLongestSubstring("aa"));
        assertEquals(2, target.lengthOfLongestSubstring("au"));
        assertEquals(1, target.lengthOfLongestSubstring(" "));

        assertEquals(3, target.lengthOfLongestSubstring("abcabcbb"));
//         Explanation: The answer is "abc", with the length of 3.

        assertEquals(1, target.lengthOfLongestSubstring("bbbbb"));
//        Explanation: The answer is "b", with the length of 1.

        assertEquals(3, target.lengthOfLongestSubstring("pwwkew"));
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        assertEquals(0, target.lengthOfLongestSubstring(""));
    }
}