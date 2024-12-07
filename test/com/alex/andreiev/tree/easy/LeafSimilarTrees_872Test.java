package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTrees_872Test {

    @Test
    void leafSimilar() {
        var target = new LeafSimilarTrees_872();

        var root1 = new TreeNode(3,
            new TreeNode(5,
                new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(9), new TreeNode(8))
        );

        var root2 = new TreeNode(3,
            new TreeNode(5, new TreeNode(6), new TreeNode(7)),
            new TreeNode(1,
                new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8)))
            );

        assertTrue(target.leafSimilar(root1, root2));

        root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        assertFalse(target.leafSimilar(root1, root2));
    }
}