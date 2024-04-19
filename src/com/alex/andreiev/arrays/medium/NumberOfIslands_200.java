package com.alex.andreiev.arrays.medium;

/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:
Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Example 2:
Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3

Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 300
    grid[i][j] is '0' or '1'.
 */

import java.util.ArrayDeque;

public class NumberOfIslands_200 {
    // dfs
    public int numIslands(char[][] grid) {
        var islandsCount = 0;
        for (var row = 0; row < grid.length; row++) {
            for (var col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    islandsCount++;
                    dfs(grid, row, col);
                }
            }
        }
        return islandsCount;
    }

    void dfs(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        dfs(grid, row - 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
        dfs(grid, row + 1, col);
    }

    // bfs
//    public int numIslands(char[][] grid) {
//        if (grid == null || grid.length == 0) {
//            return 0;
//        }
//
//        int numIslands = 0;
//        int m = grid.length;
//        int n = grid[0].length;
//        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//
//        var queue = new ArrayDeque<int[]>();
//
//        for (int row = 0; row < m; row++) {
//            for (int col = 0; col < n; col++) {
//                if (grid[row][col] == '1') {
//                    numIslands++;
//                    queue.offer(new int[]{row, col});
//
//                    while (!queue.isEmpty()) {
//                        int[] curr = queue.poll();
//                        int x = curr[0];
//                        int y = curr[1];
//
//                        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] != '1') {
//                            continue;
//                        }
//
//                        grid[x][y] = '0'; // mark as visited
//
//                        for (int[] dir : directions) {
//                            int nx = x + dir[0];
//                            int ny = y + dir[1];
//                            if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == '1') {
//                                queue.offer(new int[]{nx, ny});
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        return numIslands;
//    }

}
