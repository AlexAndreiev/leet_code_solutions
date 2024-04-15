package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRootToLeafNumbersTest {

    @Test
    void sumNumbers() {
        var target = new SumRootToLeafNumbers_129();
        var root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertEquals(25, target.sumNumbers(root));

        root = new TreeNode(4,
            new TreeNode(9, new TreeNode(5), new TreeNode(1)),
            new TreeNode(0));
        assertEquals(1026, target.sumNumbers(root));

    }
}