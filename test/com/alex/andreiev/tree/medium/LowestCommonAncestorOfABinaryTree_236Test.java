package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinaryTree_236Test {

    @Test
    void lowestCommonAncestor() {
        var target = new LowestCommonAncestorOfABinaryTree_236();
        var input = new TreeNode(3,
            new TreeNode(5,
                new TreeNode(6),
                new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(0), new TreeNode(8))
            );
        assertEquals( input, target.lowestCommonAncestor(input, input.left, input.right));


        input = new TreeNode(3,
            new TreeNode(5,
                new TreeNode(6),
                new TreeNode(2, new TreeNode(7), new TreeNode(4))),
            new TreeNode(1, new TreeNode(0), new TreeNode(8))
        );
        assertEquals(input.left, target.lowestCommonAncestor(input, input.left, input.left.right.right));

        input = new TreeNode(1, new TreeNode(2), null);
        assertEquals(input, target.lowestCommonAncestor(input, input, input.left));
    }
}