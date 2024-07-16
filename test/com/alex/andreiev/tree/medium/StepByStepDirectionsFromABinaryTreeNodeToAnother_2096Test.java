package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepByStepDirectionsFromABinaryTreeNodeToAnother_2096Test {

    @Test
    void getDirections() {
        var target = new StepByStepDirectionsFromABinaryTreeNodeToAnother_2096();
        var input = new TreeNode(5,
            new TreeNode(1, new TreeNode(3), null),
            new TreeNode(2, new TreeNode(6), new TreeNode(4))
            );
        assertEquals("UURL", target.getDirections(input, 3, 6));

        input = new TreeNode(2, new TreeNode(1), null);
        assertEquals("L", target.getDirections(input, 2, 1));
    }
}