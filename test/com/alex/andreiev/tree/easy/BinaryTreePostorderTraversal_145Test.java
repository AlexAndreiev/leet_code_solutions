package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePostorderTraversal_145Test {

    @Test
    void postorderTraversal() {
        var target = new BinaryTreePostorderTraversal_145();
        var input = new TreeNode(1,
            null,
            new TreeNode(2, new TreeNode(3), null));
        assertIterableEquals(List.of(3, 2, 1), target.postorderTraversal(input));

        assertIterableEquals(List.of(), target.postorderTraversal(null));
        assertIterableEquals(List.of(1), target.postorderTraversal(new TreeNode(1)));

        input = new TreeNode(1,
            null,
            new TreeNode(2)
        );
        assertIterableEquals(List.of(2, 1), target.postorderTraversal(input));
    }
}