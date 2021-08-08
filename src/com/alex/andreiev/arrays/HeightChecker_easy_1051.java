package com.alex.andreiev.arrays;

import java.util.Arrays;

/* A school is trying to take an annual photo of all the students.
    The students are asked to stand in a single file line in non-decreasing order by height.
    Let this ordering be represented by the integer array expected where expected[i] is the expected height
        of the ith student in line.
    You are given an integer array heights representing the current order that the students are standing in.
    Each heights[i] is the height of the ith student in line (0-indexed).
    Return the number of indices where heights[i] != expected[i].

    Constraints:
        1 <= heights.length <= 100
        1 <= heights[i] <= 100

    Hit #1
        Build the correct order of heights by sorting another array, then compare the two arrays.
* */

public class HeightChecker_easy_1051 {
    public int heightChecker(int[] heights) {
        if (heights == null || heights.length == 0) return 0;

        var sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i])
                res++;
        }
        return res;
    }
}
