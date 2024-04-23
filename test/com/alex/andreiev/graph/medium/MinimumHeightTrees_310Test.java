package com.alex.andreiev.graph.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTrees_310Test {

    @Test
    void findMinHeightTrees() {
        var target = new MinimumHeightTrees_310();
        assertIterableEquals(List.of(1), target.findMinHeightTrees(4,
            new int[][]{
                {1, 0},
                {1, 2},
                {1, 3}
            }));

        assertIterableEquals(List.of(3, 4), target.findMinHeightTrees(6,
            new int[][]{
                {3, 0},
                {3, 1},
                {3, 2},
                {3, 4},
                {5, 4}
            }));
    }
}