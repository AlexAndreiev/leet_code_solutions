package com.alex.andreiev.binary.search.medium;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInBST_450Test {

    @Test
    void deleteNode() {
        var target = new DeleteNodeInBST_450();

        var root = new TreeNode(5,
            new TreeNode(3, new TreeNode(2), new TreeNode(4)),
            new TreeNode(6, null, new TreeNode(7))
        );
        var expected = new TreeNode(5,
            new TreeNode(4, new TreeNode(2), null),
            new TreeNode(6, null, new TreeNode(7))
        );
        assertEquals(expected, target.deleteNode(root, 3));


        root = new TreeNode(5,
            new TreeNode(3, new TreeNode(2), new TreeNode(4)),
            new TreeNode(6, null, new TreeNode(7))
        );
        expected = new TreeNode(5,
            new TreeNode(3, new TreeNode(2), new TreeNode(4)),
            new TreeNode(6, null, new TreeNode(7))
        );
        assertEquals(expected, target.deleteNode(root, 0));


        root = null;
        expected = null;
        assertEquals(expected, target.deleteNode(root, 0));

        root = new TreeNode(0);
        assertEquals(expected, target.deleteNode(root, 0));


        root = new TreeNode(5,
            new TreeNode(3, new TreeNode(2), new TreeNode(4)),
            new TreeNode(6, null, new TreeNode(7))
        );
        expected = new TreeNode(6,
            new TreeNode(3, new TreeNode(2), new TreeNode(4)),
            new TreeNode(7)
        );
        assertEquals(expected, target.deleteNode(root, 5));

        root = new TreeNode(5,
            new TreeNode(2, null, null),
            new TreeNode(16,
                new TreeNode(15), new TreeNode(17))
        );
        expected = new TreeNode(15,
            new TreeNode(2),
            new TreeNode(16, null,  new TreeNode(17))
        );
        assertEquals(expected, target.deleteNode(root, 5));

    }
}