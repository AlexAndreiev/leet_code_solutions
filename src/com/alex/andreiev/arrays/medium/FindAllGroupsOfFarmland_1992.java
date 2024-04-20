package com.alex.andreiev.arrays.medium;

/*
You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land
and a 1 represents a hectare of farmland.
To keep the land organized, there are designated rectangular areas of hectares
that consist entirely of farmland. These rectangular areas are called groups. No two groups are adjacent,
meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.
land can be represented by a coordinate system where the top left corner of land is (0, 0) and the bottom
right corner of land is (m-1, n-1).

Find the coordinates of the top left and bottom right corner of each group of farmland.
A group of farmland with a top left corner at (r1, c1) and a bottom right corner at (r2, c2)
is represented by the 4-length array [r1, c1, r2, c2].
Return a 2D array containing the 4-length arrays described above for each group of farmland in land.
If there are no groups of farmland, return an empty array.
You may return the answer in any order.

Example 1:
Input: land = [[1,0,0],[0,1,1],[0,1,1]]
Output: [[0,0,0,0],[1,1,2,2]]
Explanation:
The first group has a top left corner at land[0][0] and a bottom right corner at land[0][0].
The second group has a top left corner at land[1][1] and a bottom right corner at land[2][2].

Example 2:
Input: land = [[1,1],[1,1]]
Output: [[0,0,1,1]]
Explanation:
The first group has a top left corner at land[0][0] and a bottom right corner at land[1][1].

Example 3:
Input: land = [[0]]
Output: []
Explanation:
There are no groups of farmland.

Constraints:
    m == land.length
    n == land[i].length
    1 <= m, n <= 300
    land consists of only 0's and 1's.
    Groups of farmland are rectangular in shape.

Hint 1
Since every group of farmland is rectangular,
the top left corner of each group will have the smallest x-coordinate
and y-coordinate of any farmland in the group.

Hint 2
Similarly, the bottom right corner of each group will have the largest x-coordinate
and y-coordinate of any farmland in the group.

Hint 3
Use DFS to traverse through different groups of farmlands and keep track
of the smallest and largest x-coordinate and y-coordinates you have seen in each group.
 */

import java.util.ArrayDeque;
import java.util.ArrayList;

public class FindAllGroupsOfFarmland_1992 {

    // dfs
    public int[][] findFarmland(int[][] land) {
        var l = new ArrayList<int[]>();
        for (var row = 0; row < land.length; row++) {
            for (var col = 0; col < land[0].length; col++) {
                if (land[row][col] == 1) {
                    var br = dfs(land, row, col);
                    l.add(new int[] {row, col, br[0], br[1]});
                }
            }
        }

        return l.toArray(int[][]::new);
    }

    int[] dfs(int[][] land, int row, int col) {
        if (row >= land.length || col >= land[0].length || land[row][col] == 0) {
            return null;
        }

        land[row][col] = 0;
        var br = dfs(land, row + 1, col);
        var bc = dfs(land, row, col + 1);
        return (br != null) ? br : (bc != null) ? bc : new int[] {row, col};
    }

    // bfs
//    public int[][] findFarmland(int[][] land) {
//        var l = new ArrayList<int[]>();
//        var q = new ArrayDeque<int[]>();
//        var x = 0;
//        var y = 0;
//
//        for (var row = 0; row < land.length; row++) {
//            for (var col = 0; col < land[0].length; col++) {
//                if (land[row][col] != 1) continue;
//
//                q.add(new int[] {row, col});
//
//                x = row;
//                y = col;
//                while (!q.isEmpty()) {
//                    var arr = q.remove();
//
//                    var row1 = arr[0];
//                    var col1 = arr[1];
//                    if (row1 >= land.length || col1 >= land[0].length || land[row1][col1] == 0) {
//                        continue;
//                    }
//                    x = row1;
//                    y = col1;
//
//                    land[row1][col1] = 0;
//                    q.add(new int[] {row1 + 1, col1});
//                    q.add(new int[] {row1, col1 + 1});
//                }
//                l.add(new int[] {row, col, x, y});
//            }
//        }
//
//        return l.toArray(int[][]::new);
//    }
}
