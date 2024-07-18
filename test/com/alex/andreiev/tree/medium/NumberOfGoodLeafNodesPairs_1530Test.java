package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodLeafNodesPairs_1530Test {

    @Test
    void countPairs() {
        var target = new NumberOfGoodLeafNodesPairs_1530();
        var input = new TreeNode(1,
            new TreeNode(2, null, new TreeNode(4)),
            new TreeNode(3));
        assertEquals(1, target.countPairs(input, 3));

        input = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, new TreeNode(6), new TreeNode(7))
        );
        assertEquals(2, target.countPairs(input, 3));

        input = new TreeNode(7,
            new TreeNode(1,
                new TreeNode(6),
                null
            ),
            new TreeNode(4,
                new TreeNode(5),
                new TreeNode(3, null, new TreeNode(2))
            )
        );
        assertEquals(1, target.countPairs(input, 3));
    }
}