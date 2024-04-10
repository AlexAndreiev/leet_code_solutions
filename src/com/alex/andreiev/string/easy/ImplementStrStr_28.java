package com.alex.andreiev.string.easy;

/*
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string.
This is consistent to C's strstr() and Java's indexOf().

    Constraints:
    0 <= haystack.length, needle.length <= 5 * 104
    haystack and needle consist of only lower-case English characters.
*/

public class ImplementStrStr_28 {
    public int strStr(String haystack, String needle) {

        /*
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */
        if (haystack == null || needle == null || needle.isEmpty())
            return 0;
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        if (haystackLen < needleLen) return  -1;

        int needlePos = 0;
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            for (int j = i; j <= i + needleLen; j++) {
                char needleChar = needle.charAt(needlePos++);
                if (haystack.charAt(j) != needleChar) {
                    needlePos = 0;
                    break;
                }
                if (needlePos == needleLen)
                    return i;
            }
        }
        return -1;
    }
}
