package com.alex.andreiev.string.easy;

import java.util.HashMap;
/*
* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Constraints:
    1 <= s.length <= 105
    s consists of only lowercase English letters.
* */
public class FirstUniqueCharacterInAString_387 {

    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) return -1;

        /*
        * Time complexity - O(N)
        * Space complexity - O(1) -> English alphabet contains 26 letters
        * */
        var hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++)
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
