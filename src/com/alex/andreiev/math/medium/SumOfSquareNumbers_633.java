package com.alex.andreiev.math.medium;

/*
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5

Example 2:
Input: c = 3
Output: false

Constraints:
    0 <= c <= 231 - 1
 */
public class SumOfSquareNumbers_633 {

    // Fermat Theorem
    // Any positive number nnn is expressible as a sum of two squares if and only if the prime factorization of nnn,
    // every prime of the form (4k+3)(4k+3)(4k+3) occurs an even number of times.
    public boolean judgeSquareSum(int c) {
        for (var i = 2; i * i <= c; i++) {
            var count = 0;
            if (c % i == 0) {
                while (c % i == 0) {
                    count++;
                    c /= i;
                }
                if (i % 4 == 3 && count % 2 != 0)
                    return false;
            }
        }
        return c % 4 != 3;
    }

    // binary search
//    public boolean judgeSquareSum(int c) {
//        for (long a = 0; a * a <= c; a++) {
//            int b = c - (int)(a * a);
//            if (binary_search(0, b, b))
//                return true;
//        }
//        return false;
//    }
//    public boolean binary_search(long s, long e, int n) {
//        if (s > e)
//            return false;
//        long mid = s + (e - s) / 2;
//        if (mid * mid == n)
//            return true;
//        if (mid * mid > n)
//            return binary_search(s, mid - 1, n);
//        return binary_search(mid + 1, e, n);
//    }
}
