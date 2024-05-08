package com.alex.andreiev.arrays.easy;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

Constraints:
    2 <= cost.length <= 1000
    0 <= cost[i] <= 999


 */

import java.util.Arrays;

public class MinCostClimbingStairs_746 {
    // bottom up
    public int minCostClimbingStairs(int[] cost) {
        var n = cost.length;
        var memo = new int[n];

        memo[n-1] = cost[n-1];
        memo[n-2] = cost[n-2];
        for (var i = cost.length-3; i >= 0; i--) {
            memo[i] = Math.min(memo[i+1], memo[i+2]) + cost[i];
        }
        return Math.min(memo[0], memo[1]);
    }

    // top down
//    public int minCostClimbingStairs(int[] cost) {
//        var memo = new int[cost.length];
//        Arrays.fill(memo, -1);
//
//        return Math.min(minSteps(cost, 0, memo), minSteps(cost, 1, memo));
//    }
//
//    int minSteps(int[] cost, int pos, int[] memo) {
//        if (pos >= cost.length) {
//            return 0;
//        }
//
//        if (memo[pos] != -1) {
//            return memo[pos];
//        }
//
//        var min = Math.min(minSteps(cost, pos+1, memo), minSteps(cost, pos+2, memo)) + cost[pos];
//        memo[pos] = min;
//        return min;
//    }
}
