package com.alex.andreiev.string.medium;

import java.util.Stack;

/*
You are given a string s that consists of lower case English letters and brackets.
Reverse the strings in each pair of matching parentheses, starting from the innermost one.
Your result should not contain any brackets.

Example 1:
Input: s = "(abcd)"
Output: "dcba"

Example 2:
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

Example 3:
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

Constraints:
    1 <= s.length <= 2000
    s only contains lower case English characters and parentheses.
    It is guaranteed that all parentheses are balanced.

Hint 1
Find all brackets in the string.
Hint 2
Does the order of the reverse matter ?
Hint 3
The order does not matter.
 */
public class ReverseSubstringsBetweenEachPairOfParentheses_1190 {

    // Wormhole Teleportation technique
    public String reverseParentheses(String s) {
        var n = s.length();
        var openParenthesesIndices = new Stack<Integer>();
        var pair = new int[n];

        // First pass: Pair up parentheses
        for (var i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                openParenthesesIndices.push(i);
            }
            if (s.charAt(i) == ')') {
                var j = openParenthesesIndices.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        // Second pass: Build the result string
        var result = new StringBuilder();
        for (
                int currIndex = 0, direction = 1;
                currIndex < n;
                currIndex += direction
        ) {
            if (s.charAt(currIndex) == '(' || s.charAt(currIndex) == ')') {
                currIndex = pair[currIndex];
                direction = -direction;
            } else {
                result.append(s.charAt(currIndex));
            }
        }

        return result.toString();
    }


    //  Straightforward Way
//    public String reverseParentheses(String s) {
//        var stack = new Stack<StringBuilder>();
//        var sb = new StringBuilder();
//        for (var i = 0; i < s.length(); i++) {
//            var ch = s.charAt(i);
//            switch (ch) {
//                case '(' -> {
//                    stack.push(sb);
//                    sb = new StringBuilder();
//                }
//                case ')' -> sb = stack.pop().append(sb.reverse());
//                default -> sb.append(ch);
//            }
//        }
//
//        return sb.toString();
//    }
}
