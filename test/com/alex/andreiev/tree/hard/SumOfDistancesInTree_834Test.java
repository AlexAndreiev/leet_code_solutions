package com.alex.andreiev.tree.hard;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDistancesInTree_834Test {

    @Test
    void sumOfDistancesInTree() {
        var target = new SumOfDistancesInTree_834();
        var input = new int[][] {
            {0,1},
            {0,2},
            {2,3},
            {2,4},
            {2,5}
        };

        assertArrayEquals(new int[] {8,12,6,10,10,10}, target.sumOfDistancesInTree(6, input));
        assertArrayEquals(new int[] {0}, target.sumOfDistancesInTree(1, new int[][] {}));
        assertArrayEquals(new int[] {1, 1}, target.sumOfDistancesInTree(2, new int[][]{{1, 0}}));
    }
}