package com.alex.andreiev.tree.easy;

/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Constraints:
    The number of the nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

Follow up: Recursive solution is trivial, could you do it iteratively?
 */

import com.alex.andreiev.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {

    // recursive
//    public List<Integer> postorderTraversal(TreeNode root) {
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
//        recursive(node.right, list);
//        list.add(node.val);
//    }

    // iterable
    public List<Integer> postorderTraversal(TreeNode root) {
        var result = new ArrayList<Integer>();
        var stack = new Stack<TreeNode>();
        var p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                result.add(p.val);  // Add before going to children
                stack.push(p);
                p = p.right;
            } else {
                p = stack.pop();
                p = p.left;
            }
        }
        return result.reversed();
    }
}
