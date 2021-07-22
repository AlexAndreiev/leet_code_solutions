package com.alex.andreiev.tree;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOfBinaryTree_easy_104Test {

    @Test
    void maxDepth() {
        var target = new MaximumOfBinaryTree_easy_104();
        var tree = new TreeNode(3, new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, target.maxDepth(tree));

        tree = new TreeNode(1, null, new TreeNode(2));
        assertEquals(2, target.maxDepth(tree));

        assertEquals(0, target.maxDepth(null));

        tree = new TreeNode(0);
        assertEquals(1, target.maxDepth(tree));
    }
}