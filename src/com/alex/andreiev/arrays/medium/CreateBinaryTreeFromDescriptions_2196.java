package com.alex.andreiev.arrays.medium;

import com.alex.andreiev.utils.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti]
indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,
    If isLefti == 1, then childi is the left child of parenti.
    If isLefti == 0, then childi is the right child of parenti.
Construct the binary tree described by descriptions and return its root.
The test cases will be generated such that the binary tree is valid.

Example 1:
Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
Output: [50,20,80,15,17,19]
Explanation: The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.

Example 2:
Input: descriptions = [[1,2,1],[2,3,0],[3,4,1]]
Output: [1,2,null,null,3,4]
Explanation: The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.

Constraints:
    1 <= descriptions.length <= 104
    descriptions[i].length == 3
    1 <= parenti, childi <= 105
    0 <= isLefti <= 1
    The binary tree described by descriptions is valid.

Hint 1
Could you represent and store the descriptions more efficiently?
Hint 2
Could you find the root node?
Hint 3
The node that is not a child in any of the descriptions is the root node.
 */
public class CreateBinaryTreeFromDescriptions_2196 {
    public TreeNode createBinaryTree(int[][] descriptions) {
        var rootSet = new HashSet<Integer>();
        for (int[] description : descriptions) {
            rootSet.add(description[0]);
        }

        var map = new HashMap<Integer, int[]>();
        for (var description : descriptions) {
            var root = description[0];
            var val = description[1];
            rootSet.remove(val);
            var node = map.computeIfAbsent(root, k -> new int[2]);
            if (description[2] == 1) {
                node[0] = val;
            } else {
                node[1] = val;
            }
        }

        return constructTree(rootSet.iterator().next(), map);
    }

    private TreeNode constructTree(int parent, Map<Integer, int[]> map) {
        if (parent == 0) {
            return null;
        }

        var arr = map.get(parent);
        var node = new TreeNode(parent);
        if (arr == null) {
            return node;
        }

        node.left = constructTree(arr[0], map);
        node.right = constructTree(arr[1], map);
        return node;
    }
}
