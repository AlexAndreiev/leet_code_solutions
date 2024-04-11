package com.alex.andreiev.string.medium;

/*
Given string num representing a non-negative integer num, and an integer k,
return the smallest possible integer after removing k digits from num.

Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2
to form the new number 1219 which is the smallest.

Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200.
Note that the output must not contain leading zeroes.

Example 3:
Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number, and it is left
with nothing which is 0.

Constraints:
    1 <= k <= num.length <= 105
    num consists of only digits.
    num does not have any leading zeros except for the zero itself.
 */

import java.util.Stack;

public class RemoveKDigits_402 {

    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        var stack = new Stack<Character>();
        for (var ch : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while (!stack.empty() && k > 0) {
            stack.pop();
            k--;
        }

        var sb = new StringBuilder(stack.size());
        for (var ch : stack) {
            sb.append(ch);
        }

        // removing leading zeros
        while (!sb.isEmpty() && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.isEmpty() ? "0" : sb.toString();
    }
}
