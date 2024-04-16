package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOneRowToTree_623Test {

    @Test
    void addOneRow() {
        var target = new AddOneRowToTree_623();
        var input = new TreeNode(4,
            new TreeNode(2, new TreeNode(3), new TreeNode(1)),
            new TreeNode(6, new TreeNode(5), null)
        );

        var output = new TreeNode(4,
            new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(1)), null),
            new TreeNode(1,
                null,
                new TreeNode(6, new TreeNode(5), null))
        );

        var actual = target.addOneRow(input, 1, 2);
        assertEquals(output, actual);
    }
}