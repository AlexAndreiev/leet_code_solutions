package com.alex.andreiev.dynamic.programming.easy;

/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
ans[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

Constraints:
    0 <= n <= 105

Follow up:
    It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
    Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?

Hint 1
You should make use of what you have produced already.
Hint 2
Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
Hint 3
Or does the odd/even status of the number help you in calculating the number of 1s?
 */
public class CountingBits_338 {

    /*
    If ( i ) is even, the number of 1s in ( i ) is the same as the number of 1s in ( i/2 ) (right-shifting an even number halves it without adding a new 1).
    If ( i ) is odd, the number of 1s in ( i ) is the number of 1s in ( i - 1 ) plus one additional 1 (as adding 1 to an even number makes it odd).
     */
    public int[] countBits(int n) {
        var result = new int[n + 1];
        for (var i = 0; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
