package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestStringStartingFromLeaf_988Test {

    @Test
    void smallestFromLeaf() {
        var target = new SmallestStringStartingFromLeaf_988();
        var root = new TreeNode(0,
            new TreeNode(1, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(3), new TreeNode(4))
        );
        assertEquals("dba", target.smallestFromLeaf(root));

        root = new TreeNode(25,
            new TreeNode(1, new TreeNode(1), new TreeNode(3)),
            new TreeNode(3, new TreeNode(0), new TreeNode(2))
        );
        assertEquals("adz", target.smallestFromLeaf(root));

        root = new TreeNode(2,
            new TreeNode(2, null,
                new TreeNode(1, new TreeNode(0), null)
            ),
            new TreeNode(1, new TreeNode(0), null)
        );
        assertEquals("abc", target.smallestFromLeaf(root));
    }
}