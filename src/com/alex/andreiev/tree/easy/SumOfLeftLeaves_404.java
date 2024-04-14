package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;

/*
Given the root of a binary tree, return the sum of all left leaves.
A leaf is a node with no children.
A left leaf is a leaf that is the left child of another node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.

Example 2:
Input: root = [1]
Output: 0

Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    -1000 <= Node.val <= 1000
 */

public class SumOfLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, false);
    }

    public int dfs(TreeNode root,boolean isLeft){
        if (isLeft && root.right == null && root.left == null) return root.val;

        var sum = 0;
        if (root.right != null) {
            sum += dfs(root.right, false);
        }

        if (root.left != null) {
            sum += dfs(root.left, true);
        }

        return sum;
    }
}