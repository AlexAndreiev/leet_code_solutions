package com.alex.andreiev.arrays.hard;

/*
Given an n x n integer matrix grid, return the minimum sum of a falling path with non-zero shifts.
A falling path with non-zero shifts is a choice of exactly one element
from each row of grid such that no two elements chosen in adjacent rows are in the same column.

Example 1:
Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
Output: 13
Explanation:
The possible falling paths are:
[1,5,9], [1,5,7], [1,6,7], [1,6,8],
[2,4,8], [2,4,9], [2,6,7], [2,6,8],
[3,4,8], [3,4,9], [3,5,7], [3,5,9]
The falling path with the smallest sum is [1,5,7], so the answer is 13.

Example 2:
Input: grid = [[7]]
Output: 7

Hint 1
Use dynamic programming.
Hint 2
Let dp[i][j] be the answer for the first i rows such that column j is chosen from row i.
Hint 3
Use the concept of cumulative array to optimize the complexity of the solution.
 */

import java.util.Arrays;

public class MinimumFallingPathSum2_1289 {

    public int minFallingPathSum(int[][] grid) {
        var n = grid.length;
        if (n == 1) {
            return grid[0][0];
        }
        var prev = new int[n];

        for (var row : grid) {
            var memo = new int[n];
            for (var col = 0; col < n; col++) {
                var min = Integer.MAX_VALUE;
                for (var i = 0; i < n; i++) {
                    if (i != col) {
                        min = Math.min(min, row[col] + prev[i]);
                    }
                }
                memo[col] = min;
            }
            prev = memo;
        }

        var min = Integer.MAX_VALUE;
        for (var num : prev) {
            min = Math.min(min, num);
        }
        return min;
    }
}
