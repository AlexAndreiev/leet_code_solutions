package com.alex.andreiev.arrays.easy;

/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k
that has the maximum average value and return this value.
Any answer with a calculation error less than 10-5 will be accepted.
 */

public class MaximumAverageSubarrayI_643 {

    public double findMaxAverage(int[] nums, int k) {
        var max = 0d;
        var i = 0;
        var sum = 0d;

        while (i < k) {
            sum += nums[i];
            i++;
        }
        max = sum;

        while (i < nums.length) {
            sum = sum - nums[i-k] + nums[i];
            max = Math.max(max, sum);
            i++;
        }

        return max / k;
    }
}
