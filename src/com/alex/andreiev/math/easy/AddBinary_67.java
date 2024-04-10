package com.alex.andreiev.math.easy;

/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
 */

public class AddBinary_67 {

    public String addBinary(String a, String b) {
        var i = a.length() - 1;
        var j = b.length() - 1;

        var sb = new StringBuilder(Math.max(a.length(), b.length()));
        var debt = 0;
        while (i >= 0 || j >= 0) {
            var sum = debt;
            sum += i >= 0 ? a.charAt(i--) - '0' : 0;
            sum += j >= 0 ? b.charAt(j--) - '0' : 0;
            debt = sum > 1 ? 1 : 0;
            sb.append(sum % 2);
        }
        if (debt > 0) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
