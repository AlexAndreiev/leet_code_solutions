package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfLeftLeaves_404Test {

    @Test
    void sumOfLeftLeaves() {
        var target = new SumOfLeftLeaves_404();

        var root = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(24, target.sumOfLeftLeaves(root));

        root = new TreeNode(1);
        assertEquals(0, target.sumOfLeftLeaves(root));

        root = new TreeNode(1, null, new TreeNode(2));
        assertEquals(0, target.sumOfLeftLeaves(root));

    }
}