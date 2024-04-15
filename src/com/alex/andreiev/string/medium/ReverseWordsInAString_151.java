package com.alex.andreiev.string.medium;

/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

Constraints:
    1 <= s.length <= 104
    s contains English letters (upper-case and lower-case), digits, and spaces ' '.
    There is at least one word in s.

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 */

import java.util.Arrays;
import java.util.Stack;

public class ReverseWordsInAString_151 {

//    public String reverseWords(String s) {
//        var sb = new StringBuilder(s.length() -1);
//
//        var stack = new Stack<String>();
//        for (var i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != ' ') {
//                sb.append(s.charAt(i));
//            }
//            else if (!sb.isEmpty()) {
//                stack.push(sb.toString());
//                sb.setLength(0);
//            }
//        }
//
//        if (!sb.isEmpty()) {
//            stack.push(sb.toString());
//            sb.setLength(0);
//        }
//
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop()).append(" ");
//        }
//
//        if (sb.length() > 0) {
//            sb.deleteCharAt(sb.length()-1);
//        }
//
//        return sb.toString();
//    }

    // speedy
    public String reverseWords(String s) {
        var strArr = s.toCharArray();
        var resArr = new char[strArr.length + 1];

        var pos = s.length() -1;
        var resPos = 0;
        while (pos >= 0) {
            if (strArr[pos] == ' ') {
                pos--;
                continue;
            }

            var endPos = pos;
            while (pos >= 0 && strArr[pos] != ' ') {
                pos--;
            }

            for (var i = pos + 1; i <= endPos; i++) {
                resArr[resPos++] = strArr[i];
            }
            resArr[resPos++] = ' ';
        }
        return new String(resArr, 0, resPos - 1);
    }
}
