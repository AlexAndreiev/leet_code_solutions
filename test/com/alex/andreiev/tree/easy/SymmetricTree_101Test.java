package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTree_101Test {

    @Test
    void isSymmetric() {
        var target = new SymmetricTree_101();

        var root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        assertTrue(target.isSymmetric(root));

        root = new TreeNode(1);
        root.left = new TreeNode(2, null, new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(3));
        assertFalse(target.isSymmetric(root));
    }
}