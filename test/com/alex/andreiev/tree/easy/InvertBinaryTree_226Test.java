package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTree_226Test {

    @Test
    void invertTree() {
        var target = new InvertBinaryTree_226();
        var root = new TreeNode(4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        var expected = new TreeNode(4,
            new TreeNode(7, new TreeNode(9), new TreeNode(6)),
            new TreeNode(2, new TreeNode(3), new TreeNode(1))
        );
        assertEquals(expected, target.invertTree(root));

        root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        expected = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        assertEquals(expected, target.invertTree(root));

        assertNull(target.invertTree(null));
    }
}