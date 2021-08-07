package com.alex.andreiev.arrays;

/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:
    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.

Constraints:
    board.length == 9
    board[i].length == 9
    board[i][j] is a digit or '.'.
*/

import java.util.HashSet;

public class ValidSudoku_medium_36 {

    public boolean isValidSudoku(char[][] board) {
        final int N = 9;
        if (board == null || board.length != N || board[0].length != board.length)
            return false;

        /* Approach 1
        * Time complexity - O(n^2)
        * Space Complexity - O(n^2)
        * */

/*
        // Use hash set to record the status
        var rows = new HashSet[N];
        var cols = new HashSet[N];
        var boxes = new HashSet[N];
        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                var val = board[r][c];

                // Check if the position is filled with number
                if (val == '.') {
                    continue;
                }

                // Check the row
                if (rows[r].contains(val))
                    return false;
                rows[r].add(val);

                // Check the column
                if (cols[c].contains(val))
                    return false;
                cols[c].add(val);

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx].contains(val))
                    return false;
                boxes[idx].add(val);
            }
        }
*/

        /* Approach 2
         * Time complexity - O(n^2)
         * Space Complexity - O(n^2)
         * */
/*
        // Use an array to record the status
        int[][] rows = new int[N][N];
        int[][] cols = new int[N][N];
        int[][] boxes = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // Check if the position is filled with number
                if (board[r][c] == '.')
                    continue;
                int pos = board[r][c] - '1';

                // Check the row
                if (rows[r][pos] == 1)
                    return false;
                rows[r][pos] = 1;

                // Check the column
                if (cols[c][pos] == 1)
                    return false;
                cols[c][pos] = 1;

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx][pos] == 1)
                    return false;
                boxes[idx][pos] = 1;
            }
        }
*/

        /* Approach 3
         * Time complexity - O(n^2)
         * Space Complexity - O(n)
         * */
        // Use a binary number to record previous occurrence
        int[] rows = new int[N];
        int[] cols = new int[N];
        int[] boxes = new int[N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // Check if the position is filled with number
                if (board[r][c] == '.')
                    continue;
                int val = board[r][c] - '0';
                int pos = 1 << (val - 1);

                // Check the row
                if ((rows[r] & pos) > 0)
                    return false;
                rows[r] |= pos;

                // Check the column
                if ((cols[c] & pos) > 0)
                    return false;
                cols[c] |= pos;

                // Check the box
                int idx = (r / 3) * 3 + c / 3;
                if ((boxes[idx] & pos) > 0)
                    return false;
                boxes[idx] |= pos;
            }
        }
        return true;
    }
}
