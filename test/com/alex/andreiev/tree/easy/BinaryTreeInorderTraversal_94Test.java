package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversal_94Test {

    @Test
    void inorderTraversal() {
        var target = new BinaryTreeInorderTraversal_94();
        var input = new TreeNode(1,
            null,
            new TreeNode(2, new TreeNode(3), null));
        assertIterableEquals(List.of(1, 3, 2), target.inorderTraversal(input));

        assertIterableEquals(List.of(), target.inorderTraversal(null));

        assertIterableEquals(List.of(1), target.inorderTraversal(new TreeNode(1)));
    }
}