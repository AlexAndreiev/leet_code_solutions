package com.alex.andreiev.arrays.medium;

import com.alex.andreiev.utils.TreeNode;

import java.util.*;

/*
Given the root of a binary tree, each node in the tree has a distinct value.
After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).
Return the roots of the trees in the remaining forest. You may return the result in any order.

Example 1:
Input: root = [1,2,3,4,5,6,7], to_delete = [3,5]
Output: [[1,2,null,4],[6],[7]]

Example 2:
Input: root = [1,2,4,null,3], to_delete = [3]
Output: [[1,2,4]]

Constraints:
    The number of nodes in the given tree is at most 1000.
    Each node has a distinct value between 1 and 1000.
    to_delete.length <= 1000
    to_delete contains distinct values between 1 and 1000
 */
public class DeleteNodesAndReturnForest_1110 {

//    BFS Forest Formation
public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    if (root == null) {
        return new ArrayList<>();
    }

    var toDeleteSet = new HashSet<Integer>();
    for (var val : to_delete) {
        toDeleteSet.add(val);
    }

    List<TreeNode> forest = new ArrayList<>();

    var nodesQueue = new LinkedList<TreeNode>();
    nodesQueue.add(root);

    while (!nodesQueue.isEmpty()) {
        var currentNode = nodesQueue.poll();

        if (currentNode.left != null) {
            nodesQueue.add(currentNode.left);
            // Disconnect the left child if it needs to be deleted
            if (toDeleteSet.contains(currentNode.left.val)) {
                currentNode.left = null;
            }
        }

        if (currentNode.right != null) {
            nodesQueue.add(currentNode.right);
            // Disconnect the right child if it needs to be deleted
            if (toDeleteSet.contains(currentNode.right.val)) {
                currentNode.right = null;
            }
        }

        // If the current node needs to be deleted, add its non-null children to the forest
        if (toDeleteSet.contains(currentNode.val)) {
            if (currentNode.left != null) {
                forest.add(currentNode.left);
            }
            if (currentNode.right != null) {
                forest.add(currentNode.right);
            }
        }
    }

    // Ensure the root is added to the forest if it is not to be deleted
    if (!toDeleteSet.contains(root.val)) {
        forest.add(root);
    }

    return forest;
}

//    Recursion (Postorder Traversal)
//    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
//        var toDeleteSet = new HashSet<Integer>();
//        for (int val : to_delete) {
//            toDeleteSet.add(val);
//        }
//        var forest = new ArrayList<TreeNode>();
//
//        root = processNode(root, toDeleteSet, forest);
//
//        // If the root is not deleted, add it to the forest
//        if (root != null) {
//            forest.add(root);
//        }
//
//        return forest;
//    }
//
//    private TreeNode processNode(
//        TreeNode node,
//        Set<Integer> toDeleteSet,
//        List<TreeNode> forest
//    ) {
//        if (node == null) {
//            return null;
//        }
//
//        node.left = processNode(node.left, toDeleteSet, forest);
//        node.right = processNode(node.right, toDeleteSet, forest);
//
//        // Node Evaluation: Check if the current node needs to be deleted
//        if (toDeleteSet.contains(node.val)) {
//            // If the node has left or right children, add them to the forest
//            if (node.left != null) {
//                forest.add(node.left);
//            }
//            if (node.right != null) {
//                forest.add(node.right);
//            }
//            // Return null to its parent to delete the current node
//            return null;
//        }
//
//        return node;
//    }
}
