package com.alex.andreiev.math.easy;

/*
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.

Example 1:
Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4

Example 2:
Input: n = 25
Output: 1389537

Constraints:
    0 <= n <= 37
    The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.

Hint 1
Make an array F of length 38, and set F[0] = 0, F[1] = F[2] = 1.

Hint 2
Now write a loop where you set F[n+3] = F[n] + F[n+1] + F[n+2], and return F[n].
 */

public class NthTribonacciNumber_1137 {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }

        var num1 = 0;
        var num2 = 1;
        var num3 = 1;
        var tr = 0;
        for (var i = 3; i <= n; i++) {
            tr = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = tr;
        }

        return tr;
    }
}
