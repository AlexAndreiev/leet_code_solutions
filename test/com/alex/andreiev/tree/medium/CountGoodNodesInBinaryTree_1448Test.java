package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTree_1448Test {

    @Test
    void goodNodes() {
        var target = new CountGoodNodesInBinaryTree_1448();

        var treeNode = new TreeNode(3,
            new TreeNode(1, new TreeNode(3), null),
            new TreeNode(4, new TreeNode(1), new TreeNode(5))
        );
        assertEquals(4, target.goodNodes(treeNode));


        treeNode = new TreeNode(3,
            new TreeNode(3, new TreeNode(4), new TreeNode(2)),
            null
        );
        assertEquals(3, target.goodNodes(treeNode));


        treeNode = new TreeNode(1);
        assertEquals(1, target.goodNodes(treeNode));
    }
}