package com.alex.andreiev.string.easy;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false


Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

Hint 1
Use a stack of characters.

Hint 2
When you encounter an opening bracket, push it to the top of the stack.

Hint 3
When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack. Otherwise, return false.

 */


import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        var st = new Stack<Character>();
        var map = Map.of(')', '(', ']', '[', '}', '{');
        for (var ch : s.toCharArray()) {
            switch (ch) {
                case '(', '[', '{' -> st.push(ch);
                case ')', ']', '}' -> {
                    if (st.isEmpty() || !st.pop().equals(map.get(ch))) {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
