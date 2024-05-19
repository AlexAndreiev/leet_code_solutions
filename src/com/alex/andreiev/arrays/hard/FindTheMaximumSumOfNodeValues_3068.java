package com.alex.andreiev.arrays.hard;

/*
There exists an undirected tree with n nodes numbered 0 to n - 1.
You are given a 0-indexed 2D integer array edges of length n - 1,
where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the tree.
You are also given a positive integer k, and a 0-indexed array of non-negative integers nums of length n,
where nums[i] represents the value of the node numbered i.
Alice wants the sum of values of tree nodes to be maximum, for which Alice can perform
the following operation any number of times (including zero) on the tree:
    Choose any edge [u, v] connecting the nodes u and v, and update their values as follows:
        nums[u] = nums[u] XOR k
        nums[v] = nums[v] XOR k

Return the maximum possible sum of the values Alice can achieve by performing the operation any number of times.

Example 1:
Input: nums = [1,2,1], k = 3, edges = [[0,1],[0,2]]
Output: 6
Explanation: Alice can achieve the maximum sum of 6 using a single operation:
- Choose the edge [0,2]. nums[0] and nums[2] become: 1 XOR 3 = 2, and the array nums becomes: [1,2,1] -> [2,2,2].
The total sum of values is 2 + 2 + 2 = 6.
It can be shown that 6 is the maximum achievable sum of values.

Example 2:
Input: nums = [2,3], k = 7, edges = [[0,1]]
Output: 9
Explanation: Alice can achieve the maximum sum of 9 using a single operation:
- Choose the edge [0,1]. nums[0] becomes: 2 XOR 7 = 5 and nums[1] become: 3 XOR 7 = 4, and the array nums becomes: [2,3] -> [5,4].
The total sum of values is 5 + 4 = 9.
It can be shown that 9 is the maximum achievable sum of values.

Example 3:
Input: nums = [7,7,7,7,7,7], k = 3, edges = [[0,1],[0,2],[0,3],[0,4],[0,5]]
Output: 42
Explanation: The maximum achievable sum is 42 which can be achieved by Alice performing no operations.

Constraints:
    2 <= n == nums.length <= 2 * 104
    1 <= k <= 109
    0 <= nums[i] <= 109
    edges.length == n - 1
    edges[i].length == 2
    0 <= edges[i][0], edges[i][1] <= n - 1
    The input is generated such that edges represent a valid tree.
 */

import java.util.Arrays;

public class FindTheMaximumSumOfNodeValues_3068 {

    // Greedy (Finding local maxima and minima)
    // 1 ms
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        var sum = 0;
        var count = 0;
        var positiveMinimum = (1 << 30);
        var negativeMaximum = -1 * (1 << 30);

        for (var nodeValue : nums) {
            var operatedNodeValue = nodeValue ^ k;
            sum += nodeValue;
            var netChange = operatedNodeValue - nodeValue;
            if (netChange > 0) {
                positiveMinimum = Math.min(positiveMinimum, netChange);
                sum += netChange;
                count++;
            } else {
                negativeMaximum = Math.max(negativeMaximum, netChange);
            }
        }

        // If the number of positive netChange values is even, return the sum.
        if (count % 2 == 0) {
            return sum;
        }

        // Otherwise return the maximum of both discussed cases.
        return Math.max(sum - positiveMinimum, sum + negativeMaximum);
    }

    // Greedy (Sorting based approach)
    // 8 ms
//    public long maximumValueSum(int[] nums, int k, int[][] edges) {
//        var n = nums.length;
//        var netChange = new int[n];
//        var nodeSum = 0;
//
//        for (var i = 0; i < n; i++) {
//            netChange[i] = (nums[i] ^ k) - nums[i];
//            nodeSum += nums[i];
//        }
//
//        Arrays.sort(netChange);
//        // Reverse the sorted array
//        for (var i = 0; i < n / 2; i++) {
//            int temp = netChange[i];
//            netChange[i] = netChange[n - 1 - i];
//            netChange[n - 1 - i] = temp;
//        }
//
//        for (var i = 0; i < n; i += 2) {
//            // If netChange contains odd number of elements break the loop
//            if (i + 1 == n) {
//                break;
//            }
//            var pairSum = netChange[i] + netChange[i + 1];
//            // Include in nodeSum if pairSum is positive
//            if (pairSum > 0) {
//                nodeSum += pairSum;
//            }
//        }
//        return nodeSum;
//    }

    // Bottom-up Dynamic Programming (Tabulation)
    // 9 ms
//    public long maximumValueSum(int[] nums, int k, int[][] edges) {
//        var n = nums.length;
//        var dp = new long[n + 1][2];
//        dp[n][1] = 0;
//        dp[n][0] = Integer.MIN_VALUE;
//
//        for (var index = n - 1; index >= 0; index--) {
//            for (var isEven = 0; isEven <= 1; isEven++) {
//                // Case 1: we perform the operation on this element.
//                var performOperation = dp[index + 1][isEven ^ 1] + (nums[index] ^ k);
//                // Case 2: we don't perform operation on this element.
//                var dontPerformOperation = dp[index + 1][isEven] + nums[index];
//
//                dp[index][isEven] = Math.max(performOperation, dontPerformOperation);
//            }
//        }
//
//        return dp[0][1];
//    }


    // Top-Down Dynamic Programming - Memoization
    // 15 ms
//    public long maximumValueSum(int[] nums, int k, int[][] edges) {
//        var memo = new long[nums.length][2];
//        for (var row : memo) {
//            Arrays.fill(row, -1);
//        }
//        return maxSumOfNodes(0, 1, nums, k, memo);
//    }
//
//    private long maxSumOfNodes(int index, int isEven, int[] nums, int k,
//                               long[][] memo) {
//        if (index == nums.length) {
//            // If the operation is performed on an odd number of elements return
//            // INT_MIN
//            return isEven == 1 ? 0 : Integer.MIN_VALUE;
//        }
//        if (memo[index][isEven] != -1) {
//            return memo[index][isEven];
//        }
//        // No operation performed on the element
//        var noXorDone = nums[index] + maxSumOfNodes(index + 1, isEven, nums, k, memo);
//        // XOR operation is performed on the element
//        var xorDone = (nums[index] ^ k) +
//            maxSumOfNodes(index + 1, isEven ^ 1, nums, k, memo);
//
//        // Memoize and return the result
//        return memo[index][isEven] = Math.max(xorDone, noXorDone);
//    }
}
