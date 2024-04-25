package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreorderTraversal_144Test {

    @Test
    void preorderTraversal() {
        var target = new BinaryTreePreorderTraversal_144();
        var input = new TreeNode(1,
            null,
            new TreeNode(2, new TreeNode(3), null));
        assertIterableEquals(List.of(1,2,3), target.preorderTraversal(input));


        assertIterableEquals(List.of(), target.preorderTraversal(null));

        assertIterableEquals(List.of(1), target.preorderTraversal(new TreeNode(1)));
    }
}