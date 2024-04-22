package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootEqualsSumOfChildren_2236Test {

    @Test
    void checkTree() {
        var target = new RootEqualsSumOfChildren_2236();
        var root = new TreeNode(10, new TreeNode(4), new TreeNode(6));
        assertTrue(target.checkTree(root));

        root = new TreeNode(5, new TreeNode(3), new TreeNode(1));
        assertFalse(target.checkTree(root));
    }
}