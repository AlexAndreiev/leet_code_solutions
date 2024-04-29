package com.alex.andreiev.arrays.medium;

/*
Given a 0-indexed n x n integer matrix grid,
return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

Example 1:
Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]

Example 2:
Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]

Constraints:

    n == grid.length == grid[i].length
    1 <= n <= 200
    1 <= grid[i][j] <= 105

Hint 1
We can use nested loops to compare every row against every column.
Hint 2
Another loop is necessary to compare the row and column element by element.
Hint 3
It is also possible to hash the arrays and compare the hashed values instead.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPairs_2352 {

    public int equalPairs(int[][] grid) {
        var sum = 0;
        var hashRows = new HashMap<List<Integer>, Integer>();

        // fill the hash set
        for (var row : grid) {
            var list = Arrays.stream(row).boxed().toList();
            hashRows.put(list, hashRows.getOrDefault(list, 0) + 1);
        }

        for (var col = 0; col < grid[0].length; col++) {
            var list = new ArrayList<Integer>(grid.length);
            for (var row = 0; row < grid.length; row++) {
                list.add(grid[row][col]);
            }
            if (hashRows.containsKey(list)) {
                sum += hashRows.get(list);
            }
        }

        return sum;

    }
}
