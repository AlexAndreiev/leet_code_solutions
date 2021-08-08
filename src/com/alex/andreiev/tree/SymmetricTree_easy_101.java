package com.alex.andreiev.tree;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    -100 <= Node.val <= 100

Follow up: Could you solve it both recursively and iteratively?
*/

import com.alex.andreiev.utils.TreeNode;
import java.util.LinkedList;

public class SymmetricTree_easy_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)  return false;
        /*
        * Time complexity - O(n)
        * Space complexity - O(n) -> number of recursive calls
        * */

        // recursively
//        return check(root.left, root.right);

        // iteratively
        var queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            var root1 = queue.poll();
            var root2 = queue.poll();
            if (root1 == null && root2 == null) return true;
            if (root1 == null || root2 == null) return false;
            if (root1.val != root2.val) return false;
            queue.add(root1.left);
            queue.add(root2.right);
            queue.add(root1.right);
            queue.add(root2.left);
        }
        return true;
    }

    private boolean check(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        return check(root1.left, root2.right)  && check(root1.right, root2.left) && root1.val == root2.val;
    }
}
