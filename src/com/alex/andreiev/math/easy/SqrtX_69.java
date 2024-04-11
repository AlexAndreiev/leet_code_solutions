package com.alex.andreiev.math.easy;

/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:
    0 <= x <= 231 - 1

Hint 1
Try exploring all integers.

Hint 2
Use the sorted property of integers to reduced the search space.
 */

public class SqrtX_69 {

    public int mySqrt(int x) {
        if (x == 1 || x == 0) { return x;}

        var start = 0L;
        long end = x;
        var mid = 0L;
        while (start <= end) {
            mid = ((end - start) / 2) + start;
            if (mid * mid == x) {
                break;
            }

            if (mid*mid < x) {
                if ((mid+1) * (mid+1) > x) break;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return (int)mid;
    }
}
