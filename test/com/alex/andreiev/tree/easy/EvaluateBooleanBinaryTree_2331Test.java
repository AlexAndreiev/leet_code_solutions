package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateBooleanBinaryTree_2331Test {

    @Test
    void evaluateTree() {
        var target = new EvaluateBooleanBinaryTree_2331();
        assertTrue(target.evaluateTree(new TreeNode(2,
            new TreeNode(1),
            new TreeNode(3,
                new TreeNode(0), new TreeNode(1))))
        );

        assertFalse(target.evaluateTree(new TreeNode(0)));
    }
}