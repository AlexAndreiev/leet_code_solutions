package com.alex.andreiev.string.easy;

/*
For two strings s and t, we say "t divides s" if
and only if s = t + t + t + ... + t + t
(i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2,
return the largest string x such that x divides both str1 and str2.

Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""

Constraints:
    1 <= str1.length, str2.length <= 1000
    str1 and str2 consist of English uppercase letters.


Hint 1
The greatest common divisor must be a prefix of each string, so we can try all prefixes.
 */

public class GreatestCommonDivisorOfStrings_1071 {

//    public String gcdOfStrings(String str1, String str2) {
//        var divisor = "";
//        var sb = new StringBuilder();
//        var pos = 0;
//        while (pos < str1.length() && pos < str2.length()) {
//            if (str1.charAt(pos) != (str2.charAt(pos))) break;
//            sb.append(str1.charAt(pos));
//
//            if (checkDivisor(str1, sb.toString()) && checkDivisor(str2, sb.toString())) {
//                divisor = sb.toString();
//            }
//            pos++;
//
//        }
//        return divisor;
//    }
//
//    public boolean checkDivisor(String str, String divString) {
//        if (str.length() % divString.length() != 0) return false;
//        for (var i = divString.length()-1; i < str.length(); i++) {
//            if (str.charAt(i) != divString.charAt(i % divString.length())) {
//                return false;
//            }
//        }
//        return true;
//    }

    // speedy
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }}
