package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteLeavesWithAGivenValue_1325Test {

    @Test
    void removeLeafNodes() {
        var target = new DeleteLeavesWithAGivenValue_1325();

        var input = new TreeNode(1,
            new TreeNode(2, new TreeNode(2), null),
            new TreeNode(3, new TreeNode(2), new TreeNode(4))
            );
        var expected = new TreeNode(1,
            null,
            new TreeNode(3, null, new TreeNode(4))
            );
        assertEquals(expected, target.removeLeafNodes(input, 2));


        input = new TreeNode(1,
            new TreeNode(3, new TreeNode(3),  new TreeNode(2)),
            new TreeNode(3)
        );
        expected = new TreeNode(1,
            new TreeNode(3, null, new TreeNode(2)),
            null
        );
        assertEquals(expected, target.removeLeafNodes(input, 3));


        input = new TreeNode(1,
            new TreeNode(2, new TreeNode(2, new TreeNode(2), null), null),
            null
        );
        expected = new TreeNode(1);
        assertEquals(expected, target.removeLeafNodes(input, 2));
    }
}