package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInABinarySearchTree_700Test {

    @Test
    void searchBST() {
        var target = new SearchInABinarySearchTree_700();
        var input = new TreeNode(4,
            new TreeNode(2, new TreeNode(1), new TreeNode(3)),
            new TreeNode(7));
        var expected  = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertEquals(expected, target.searchBST(input, 2));

        assertNull(target.searchBST(input, 5));
    }
}