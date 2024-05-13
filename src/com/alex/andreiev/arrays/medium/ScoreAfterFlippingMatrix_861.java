package com.alex.andreiev.arrays.medium;

/*
You are given an m x n binary matrix grid.

A move consists of choosing any row or column and toggling each value in that row
or column (i.e., changing all 0's to 1's, and all 1's to 0's).
Every row of the matrix is interpreted as a binary number,
and the score of the matrix is the sum of these numbers.
Return the highest possible score after making any number of moves (including zero moves).

Example 1:
Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
Output: 39
Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39

Example 2:
Input: grid = [[0]]
Output: 1

Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 20
    grid[i][j] is either 0 or 1.
 */

import java.util.List;

public class ScoreAfterFlippingMatrix_861 {
   // greedy (un modifiable input
    // 0 ms
    public int matrixScore(int[][] grid) {
        var m = grid.length;
        var n = grid[0].length;

        // Set score to summation of first column
        int score = (1 << (n - 1)) * m;

        // Loop over all other columns
        for (var j = 1; j < n; j++) {
            int countSameBits = 0;
            for (var row : grid) {
                // Count elements matching first in row
                if (row[j] == row[0]) {
                    countSameBits++;
                }
            }
            // Calculate score based on the number of same bits in a column
            countSameBits = Math.max(countSameBits, m - countSameBits);
            // Calculate the score contribution for the current column
            var columnScore = (1 << (n - j - 1)) * countSameBits;
            // Add contribution to score
            score += columnScore;
        }

        return score;
    }


    // greedy (modify input)
    // 1 ms
//    public int matrixScore(int[][] grid) {
//        var m = grid.length;
//        var n = grid[0].length;
//
//        // set first column - most left bit has greater weight
//        for (var i = 0; i < m; i++) {
//            if (grid[i][0] == 0) {
//                for (var j = 0; j < n; j++) {
//                    grid[i][j] = 1 - grid[i][j];
//                }
//            }
//        }
//
//        // optimize columns
//        for (var col = 1; col < n; col++) {
//            var sum = 0;
//            for (var row : grid) {
//                sum += row[col];
//            }
//            if (sum < m - sum) {
//                for (var row = 0; row < m; row++) {
//                    grid[row][col] = 1 - grid[row][col];
//                }
//            }
//        }
//
//        // calculate sum
//        var score = 0;
//        for (var row : grid) {
//            for (var j = 0; j < n; j++) {
//                score += row[j] << (n - j - 1);
//            }
//        }
//
//        return score;
//    }
}
