package com.alex.andreiev.string.easy;

import java.util.HashMap;

/*
Given a string s which consists of lowercase or uppercase letters,
return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example,
"Aa" is not considered a palindrome.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Constraints:
    1 <= s.length <= 2000
    s consists of lowercase and/or uppercase English letters only.
 */
public class LongestPalindrome_409 {
    // greedy
    public int longestPalindrome(String s) {
        var map = new HashMap<Character, Integer>();
        for (var i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        var l = 0;
        for (var value : map.values()) {
            l += (value/2) * 2;
        }
        return l < s.length() ? l+1 : l;
    }
}
