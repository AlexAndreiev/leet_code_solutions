package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

Follow up: Recursive solution is trivial, could you do it iteratively?
 */

public class BinaryTreePreorderTraversal_144 {


    // recursive
//    public List<Integer> preorderTraversal(TreeNode root) {
//        var list = new ArrayList<Integer>();
//        dfs(root, list);
//        return list;
//    }
//
//    public void dfs(TreeNode node, List<Integer> list) {
//        if (node == null) {
//            return;
//        }
//        list.add(node.val);
//        dfs(node.left, list);
//        dfs(node.right, list);
//    }

    // iterable
    public List<Integer> preorderTraversal(TreeNode root) {
        var result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        var stack = new Stack<TreeNode>();
        stack.add(root);

        while (!stack.isEmpty()) {
            var node = stack.pop();

            result.add(node.val);

            if (node.right != null) {
                stack.add(node.right);
            }

            if (node.left != null) {
                stack.add(node.left);
            }

        }

        return result;
    }
}
