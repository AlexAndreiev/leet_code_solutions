package com.alex.andreiev.arrays.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBinaryTreeFromDescriptions_2196Test {

    @Test
    void createBinaryTree() {
        var target = new CreateBinaryTreeFromDescriptions_2196();

        var actual = target.createBinaryTree(
            new int[][]{
                {20,15,1}, {20,17,0}, {50,20,1}, {50,80,0}, {80,19,1}
            });
        var expected = new TreeNode(50,
            new TreeNode(20, new TreeNode(15), new TreeNode(17)),
            new TreeNode(80, new TreeNode(19), null)
            );
        assertEquals(expected, actual);

        actual = target.createBinaryTree(
            new int[][]{
                {1,2,1}, {2,3,0}, {3,4,1}
            });
        expected = new TreeNode(1,
            new TreeNode(2, null,
                new TreeNode(3, new TreeNode(4), null)),
            null
        );
        assertEquals(expected, actual);
    }
}