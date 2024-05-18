package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCoinsInBinaryTree_979Test {

    @Test
    void distributeCoins() {
        var target = new DistributeCoinsInBinaryTree_979();
        assertEquals(2, target.distributeCoins(
            new TreeNode(3, new TreeNode(0), new TreeNode(0))
        ));

        assertEquals(3, target.distributeCoins(
            new TreeNode(0, new TreeNode(3), new TreeNode(0))
        ));
    }
}