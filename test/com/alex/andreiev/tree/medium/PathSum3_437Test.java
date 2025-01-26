package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum3_437Test {

    @Test
    void pathSum() {
        var target = new PathSum3_437();

        var root = new TreeNode(10,
            new TreeNode(5,
                new TreeNode(3, new TreeNode(3), new TreeNode(-2)),
                new TreeNode(2, null, new TreeNode(1))),
            new TreeNode(-3, null, new TreeNode(11))
            );
        assertEquals(3, target.pathSum(root, 8));

        root = new TreeNode(5,
            new TreeNode(4,
                new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                null),
            new TreeNode(8,
                new TreeNode(13),
                new TreeNode(4, new TreeNode(5), new TreeNode(1)))
        );
        assertEquals(3, target.pathSum(root, 22));

        root = new TreeNode(-2, null, new TreeNode(-3));
        assertEquals(1, target.pathSum(root, -3));
    }
}