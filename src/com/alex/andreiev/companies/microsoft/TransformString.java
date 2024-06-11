package com.alex.andreiev.companies.microsoft;

/*
A string S consisting of the letters A, B, C and D is given.
The string can be transformed either by removing a letter A together with an adjacent letter B,
or by removing a letter C together with an adjacent letter D.
Write a function:
    class Solution { public String solution(String S); }
that, given a string S consisting of N characters, returns any string that:
        can be obtained from S by repeatedly applying the described transformation, and
        cannot be further transformed.

If at some point there is more than one possible way to transform the string,
any of the valid transformations may be chosen.
Examples:
1. Given S = "CBACD", the function may return "C", because one of the possible sequences of operations is as follows:
The picture describes the first example test: CBACD to CBA to C.
2. Given S = "CABABD" the function may return an empty string, because one possible sequence of operations is:
The picture describes the second example test: CABABD to CABD to CD to empty
3. Given string S = "ACBDACBD" the function should return "ACBDACBD", because no operation can be applied to string S.

Write an efficient algorithm for the following assumptions:
        the length of string S is within the range [0..250,000];
        string S is made only of the following characters: 'A', 'B', 'C' and/or 'D'.
 */

public class TransformString {
}
