package com.alex.andreiev.string;
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Constraints:
    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].

Hint:
    Problem is simpler to solve by working the string from back to front and using a map.
*/
public class RomanToInteger_easy_13 {

    public int romanToInt(String s) {
        /*
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */

        int number = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            var ch = s.charAt(i);
            if (ch == 'M') number += 1000;
            else if (ch == 'D') number += 500;
            else if (ch == 'C') number = (number >= 500) ? number - 100 : number + 100;
            else if (ch == 'L') number += 50;
            else if (ch == 'X') number = (number >= 50) ? number - 10 : number + 10;
            else if (ch == 'V') number += 5;
            else if (ch == 'I') number = (number >= 5) ? number - 1 : number + 1;
        }
        return number;
    }
}
