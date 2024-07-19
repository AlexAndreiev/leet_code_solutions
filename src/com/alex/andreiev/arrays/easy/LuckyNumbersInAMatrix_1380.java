package com.alex.andreiev.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:
Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

Constraints:
    m == mat.length
    n == mat[i].length
    1 <= n, m <= 50
    1 <= matrix[i][j] <= 105.
    All elements in the matrix are distinct.
 */
public class LuckyNumbersInAMatrix_1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        var colCount = matrix[0].length;

        var colPos = new int[colCount];

        for (var i = 0; i < colCount; i++) {
            var max = Integer.MIN_VALUE;
            for (var row : matrix) {
                if (row[i] > max) {
                    max = row[i];
                    colPos[i] = max;
                }
            }
        }

        var result = new ArrayList<Integer>();
        for (var row : matrix) {
            var pos = 0;
            var min = Integer.MAX_VALUE;
            for (var j = 0; j < colCount; j++) {
                if (row[j] < min) {
                    min = row[j];
                    pos = j;
                }
            }
            if (colPos[pos] == min) {
                result.add(min);
            }
        }

        return result;
    }
}
