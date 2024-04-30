package com.alex.andreiev.string.medium;

/*
A wonderful string is a string where at most one letter appears an odd number of times.
    For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
Given a string word that consists of the first ten lowercase English letters ('a' through 'j'),
return the number of wonderful non-empty substrings in word.
If the same substring appears multiple times in word, then count each occurrence separately.
A substring is a contiguous sequence of characters in a string.

Example 1:
Input: word = "aba"
Output: 4
Explanation: The four wonderful substrings are underlined below:
- "aba" -> "a"
- "aba" -> "b"
- "aba" -> "a"
- "aba" -> "aba"

Example 2:
Input: word = "aabb"
Output: 9
Explanation: The nine wonderful substrings are underlined below:
- "aabb" -> "a"
- "aabb" -> "aa"
- "aabb" -> "aab"
- "aabb" -> "aabb"
- "aabb" -> "a"
- "aabb" -> "abb"
- "aabb" -> "b"
- "aabb" -> "bb"
- "aabb" -> "b"

Example 3:
Input: word = "he"
Output: 2
Explanation: The two wonderful substrings are underlined below:
- "he" -> "h"
- "he" -> "e"

Constraints:
    1 <= word.length <= 105
    word consists of lowercase English letters from 'a' to 'j'.

Hint 1
For each prefix of the string, check which characters are of
even frequency and which are not and represent it by a bitmask.
Hint 2
Find the other prefixes whose masks differs from the current prefix mask by at most one bit.
 */

import java.util.HashMap;

public class NumberOfWonderfulSubstrings_1915 {
    public long wonderfulSubstrings(String word) {
        var N = word.length();

        // Create the frequency map
        // Key = bitmask, Value = frequency of bitmask key
        var freq = new HashMap<Integer, Integer>();

        // The empty prefix can be the smaller prefix, which is handled like this
        freq.put(0, 1);

        var mask = 0;
        var res = 0L;
        for (var i = 0; i < N; i++) {
            var c = word.charAt(i);
            var bit = c - 'a';

            // Flip the parity of the c-th bit in the running prefix mask
            mask ^= (1 << bit);

            // Count smaller prefixes that create substrings with no odd occurring letters
            res += freq.getOrDefault(mask, 0);

            // Increment value associated with mask by 1
            freq.put(mask, freq.getOrDefault(mask, 0) + 1);

            // Loop through every possible letter that can appear an odd number of times in a substring
            for (var odd_c=0; odd_c < 10; odd_c++) {
                res += freq.getOrDefault(mask ^ (1 << odd_c),0);
            }
        }
        return res;
    }
}
