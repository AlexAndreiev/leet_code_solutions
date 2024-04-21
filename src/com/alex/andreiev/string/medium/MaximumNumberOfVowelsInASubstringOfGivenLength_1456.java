package com.alex.andreiev.string.medium;

/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.



Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    1 <= k <= s.length

Hint 1
Keep a window of size k and maintain the number of vowels in it.

Hint 2
Keep moving the window and update the number of vowels while moving. Answer is max number of vowels of any window.
 */

import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength_1456 {
    public int maxVowels(String s, int k) {
        var auxArr = new boolean[s.length()];
        var max = 0;

        var pos = 0;
        while (pos < k) {
            if (isVowel(s.charAt(pos))) {
                auxArr[pos] = true;
                max++;
            }
            pos++;
        }

        var curCount = max;
        while (pos < s.length()) {
            if (auxArr[pos-k]) {
                curCount--;
            }
            if (isVowel(s.charAt(pos))) {
                curCount++;
                auxArr[pos] = true;
            }

            if (curCount > max) {
                max = curCount;
            }
            pos++;
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
