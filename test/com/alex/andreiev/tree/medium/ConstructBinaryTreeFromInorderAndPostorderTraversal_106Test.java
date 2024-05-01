package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeFromInorderAndPostorderTraversal_106Test {

    @Test
    void buildTree() {
        var target = new ConstructBinaryTreeFromInorderAndPostorderTraversal_106();
        var expected = new TreeNode(3,
            new TreeNode(9),
            new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        assertEquals(expected, target.buildTree(
            new int[]{9,3,15,20,7}, new int[] {9,15,7,20,3}
        ));

        assertEquals(new TreeNode(-1), target.buildTree(
            new int[]{-1}, new int[] {-1}
        ));

    }
}