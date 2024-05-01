package com.alex.andreiev.arrays.medium;

/*
You are given an integer array nums and an integer target.
You want to build an expression out of nums by adding one of the symbols '+' and '-'
before each integer in nums and then concatenate all the integers.
    For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate
    them to build the expression "+2-1".
Return the number of different expressions that you can build,
which evaluates to target.

Example 1:
Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3

Example 2:
Input: nums = [1], target = 1
Output: 1

Constraints:
    1 <= nums.length <= 20
    0 <= nums[i] <= 1000
    0 <= sum(nums[i]) <= 1000
    -1000 <= target <= 1000
 */

import java.util.Arrays;

public class TargetSum_494 {

    // dp
    public int findTargetSumWays(int[] nums, int S) {
        var total = Arrays.stream(nums).sum();
        var dp = new int[nums.length][2 * total + 1];
        dp[0][nums[0] + total] = 1;
        dp[0][-nums[0] + total] += 1;

        for (var i = 1; i < nums.length; i++) {
            for (var sum = -total; sum <= total; sum++) {
                if (dp[i - 1][sum + total] > 0) {
                    dp[i][sum + nums[i] + total] += dp[i - 1][sum + total];
                    dp[i][sum - nums[i] + total] += dp[i - 1][sum + total];
                }
            }
        }

        return Math.abs(S) > total ? 0 : dp[nums.length - 1][S + total];
    }

    // Recursion with Memoization
//    int total;
//
//    public int findTargetSumWays(int[] nums, int S) {
//        total = Arrays.stream(nums).sum();
//
//        var memo = new int[nums.length][2 * total + 1];
//        for (var row : memo) {
//            Arrays.fill(row, Integer.MIN_VALUE);
//        }
//        return calculate(nums, 0, 0, S, memo);
//    }
//
//    public int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
//        if (i == nums.length) {
//            return sum == S ? 1 : 0;
//        } else {
//            if (memo[i][sum + total] != Integer.MIN_VALUE) {
//                return memo[i][sum + total];
//            }
//            var add = calculate(nums, i + 1, sum + nums[i], S, memo);
//            var subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
//            memo[i][sum + total] = add + subtract;
//            return memo[i][sum + total];
//        }
//    }

    // brute force
//    int count = 0;
//
//    public int findTargetSumWays(int[] nums, int S) {
//        calculate(nums, 0, 0, S);
//        return count;
//    }
//
//    public void calculate(int[] nums, int i, int sum, int S) {
//        if (i == nums.length) {
//            if (sum == S) {
//                count++;
//            }
//        } else {
//            calculate(nums, i + 1, sum + nums[i], S);
//            calculate(nums, i + 1, sum - nums[i], S);
//        }
//    }
}
