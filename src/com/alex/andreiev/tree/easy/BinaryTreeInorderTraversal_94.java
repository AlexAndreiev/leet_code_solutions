package com.alex.andreiev.tree.easy;

import com.alex.andreiev.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

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
public class BinaryTreeInorderTraversal_94 {


    // iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        var stack = new Stack<TreeNode>();
        var cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }

    // recursive
//    public List<Integer> inorderTraversal(TreeNode root) {
//        var list = new ArrayList<Integer>();
//        recursive(root, list);
//        return list;
//    }
//
//    void recursive(TreeNode node, List<Integer> list) {
//        if (node == null) {
//            return;
//        }
//
//        recursive(node.left, list);
//        list.add(node.val);
//        recursive(node.right, list);
//    }
}
