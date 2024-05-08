package com.alex.andreiev.companies.microsoft.fix;

/*
A non-empty array A of bits (1s and/or 0s) is given.
The maximal binary ones span of A is the length of the longest sequence of consecutive 1s.
For example, for A such that:
  A[0] = 0
  A[1] = 1
  A[2] = 1
  A[3] = 1
  A[4] = 0
  A[5] = 1
  A[6] = 1
  A[7] = 1
  A[8] = 0
  A[9] = 1
the maximal binary ones span equals 3.
There are two sequences of consecutive 1s of such a length: A[1..3] and A[5..7].
You are given an implementation of a function:
    class Solution { public int solution(int[] A); }
that, when given a non-empty array A consisting of N bits, finds the first sequence of consecutive 1s whose length equals the maximal binary ones span of A, and returns its starting position (index of the first 1 in the sequence).

If there are no bits set to 1, the function returns −1.

For example, given array A as in the example above, the function should return 1, because the maximal binary ones span in A equals 3 (which was already explained) and the first sequence of such length starts at index 1.
Given array A consisting of two bits such that:
  A[0] = 0
  A[1] = 0
the function should return −1, as there are no 1s.
The attached code is still incorrect for some inputs. Despite the error(s), the code may produce a correct answer for the example test cases. The goal of the exercise is to find and fix the bug(s) in the implementation. You can modify at most two lines.

Assume that:
        N is an integer within the range [1..1,000];
        each element of array A is an integer that can have one of the following values: 0, 1.

In your solution, focus on correctness.
The performance of your solution will not be the focus of the assessment.
 */

public class MaxBinaryOnesSpan {

    int solution(int[] A) {
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i > 0) {
            if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        if (A[i] == 1 && k + 1 >= maximal)
            result = 0;
        return result;
    }


    // PROVIDED CODE
//    public int solution(int[] A) {
//        int n = A.length;
//        int i = n - 1;
//        int result = -1;
//        int k = 0, maximal = 0;
//        while (i > 0) {
//            if (A[i] == 1) {
//                k = k + 1;
//                if (k >= maximal) {
//                    maximal = k;
//                    result = i;
//                }
//            }
//            else
//                k = 0;
//            i = i - 1;
//        }
//        if (A[i] == 1 && k + 1 > maximal)
//            result = 0;
//        return result;
//    }
}
