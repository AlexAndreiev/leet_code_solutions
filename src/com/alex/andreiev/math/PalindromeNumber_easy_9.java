package com.alex.andreiev.math;
/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Constraints:
    -2^31 <= x <= 2^(31 - 1)

Follow up: Could you solve it without converting the integer to a string?
Hint 1: Beware of overflow when you reverse the integer.
*/
public class PalindromeNumber_easy_9 {

    public boolean isPalindrome(int x) {
    /*
    * Time complexity - O(log N)
    * Space complexity - O(1)
    * */
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
