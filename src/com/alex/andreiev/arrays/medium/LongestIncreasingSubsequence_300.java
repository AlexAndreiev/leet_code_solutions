package com.alex.andreiev.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.

Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101],
therefore the length is 4.

Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4

Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1

Constraints:
    1 <= nums.length <= 2500
    -104 <= nums[i] <= 104

Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 */
public class LongestIncreasingSubsequence_300 {

    // greedy with binary search
    public int lengthOfLIS(int[] nums) {
        var sub = new ArrayList<Integer>();
        for (var x : nums) {
            if (sub.isEmpty() || sub.getLast() < x) {
                sub.add(x);
            } else {
                var idx = Collections.binarySearch(sub, x);
                if (idx >= 0) {
                    sub.set(idx, x);
                } else {
                    sub.set(Math.abs(idx + 1), x);
                }
            }
        }
        return sub.size();
    }



    // dp
//    public int lengthOfLIS(int[] nums) {
//        var dp = new int[nums.length];
//        Arrays.fill(dp, 1);
//        for (var i = 0; i < nums.length; i++) {
//            for (var j = 0; j < i; j++) {
//                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
//                    dp[i] = dp[j] + 1;
//                }
//            }
//        }
//        return Arrays.stream(dp).max().getAsInt();
//    }
}
