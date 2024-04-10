package com.alex.andreiev.string.medium;

/*
 Given a string s, find the length of the longest substring without repeating characters.

 Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
* */

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
/* Approach 1
* Time complexity - O(n)
* Space complexity - O(1)
* */
        if (s == null) return 0;
        int strLen = s.length();
        if (strLen < 2) return strLen;

        var hashMap = new HashMap<Character, Integer>();
        int len = 0;
        int i = 0;
        int startPos = 0;
        while (i < strLen) {
            var ch = s.charAt(i);
            if (hashMap.containsKey(ch) && hashMap.get(ch) >= startPos) {
                if (len < (i - startPos))
                    len = i - startPos;
                startPos = hashMap.get(ch)+1;
            }
            hashMap.put(ch, i);
            i++;
        }
        return Math.max(len, strLen - startPos);
    }
}
