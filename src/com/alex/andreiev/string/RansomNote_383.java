package com.alex.andreiev.string;

import java.util.HashMap;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be
constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:
    1 <= ransomNote.length, magazine.length <= 105
    ransomNote and magazine consist of lowercase English letters.
 */
public class RansomNote_383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        var map = new HashMap<Character, Integer>();
        for (var ch : magazine.toCharArray()) {
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }

        for (var ch: ransomNote.toCharArray()) {
            var count = map.get(ch);
            if (count == null || count == 0) {
                return false;
            }
            map.put(ch, count - 1);
        }
        return true;
    }
}
