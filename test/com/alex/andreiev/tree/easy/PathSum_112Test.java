package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum_112Test {

    @Test
    void hasPathSum() {
        var target = new PathSum_112();
        var input = new TreeNode(5,
            new TreeNode(4,
                new TreeNode(11,
                    new TreeNode(7),
                    new TreeNode(2)
                ), null),

            new TreeNode(8,
                new TreeNode(13),
                new TreeNode(4, null, new TreeNode(1))
            )
        );
        assertTrue(target.hasPathSum(input, 22));

        input = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertFalse(target.hasPathSum(input, 5));

        assertFalse(target.hasPathSum(null, 0));

        assertTrue(target.hasPathSum(new TreeNode(-2, null, new TreeNode(-3)), -5));
    }
}