package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;

/*
Given the root of a binary tree, return its maximum depth.
A binary tree's maximum depth is the number of nodes along the longest path
from the root node down to the farthest leaf node.

Constraints:
    The number of nodes in the tree is in the range [0, 104].
    -100 <= Node.val <= 100
*/
public class MaximumOfBinaryTree_104 {
    public int maxDepth(TreeNode root) {
        /*
            Approach 1
            Time complexity - O(n)
            Space complexity - O(1)
        */

        if (root == null)   return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
