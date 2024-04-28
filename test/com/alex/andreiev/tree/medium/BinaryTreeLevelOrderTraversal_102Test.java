package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversal_102Test {

    @Test
    void levelOrder() {
        var target = new BinaryTreeLevelOrderTraversal_102();
        var input = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        var expected = List.of(
            List.of(3),
            List.of(9, 20),
            List.of(15, 7)
        );
        assertIterableEquals(expected, target.levelOrder(input));
        assertIterableEquals(List.of(List.of(1)), target.levelOrder(new TreeNode(1)));
        assertIterableEquals(List.of(), target.levelOrder(null));
    }
}