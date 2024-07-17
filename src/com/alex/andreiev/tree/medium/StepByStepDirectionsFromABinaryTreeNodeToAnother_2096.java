package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;

import java.util.*;

/*
You are given the root of a binary tree with n nodes. Each node is uniquely assigned a value from 1 to n.
You are also given an integer startValue representing the value of the start node s,
and a different integer destValue representing the value of the destination node t.
Find the shortest path starting from node s and ending at node t.
Generate step-by-step directions of such path as a string consisting of only the uppercase letters 'L', 'R', and 'U'.
Each letter indicates a specific direction:
    'L' means to go from a node to its left child node.
    'R' means to go from a node to its right child node.
    'U' means to go from a node to its parent node.
Return the step-by-step directions of the shortest path from node s to node t.

Example 1:
Input: root = [5,1,2,3,null,6,4], startValue = 3, destValue = 6
Output: "UURL"
Explanation: The shortest path is: 3 → 1 → 5 → 2 → 6.

Example 2:
Input: root = [2,1], startValue = 2, destValue = 1
Output: "L"
Explanation: The shortest path is: 2 → 1.

Constraints:
    The number of nodes in the tree is n.
    2 <= n <= 105
    1 <= Node.val <= n
    All the values in the tree are unique.
    1 <= startValue, destValue <= n
    startValue != destValue

Hint 1
The shortest path between any two nodes in a tree must pass through their Lowest Common Ancestor (LCA).
The path will travel upwards from node s to the LCA and then downwards from the LCA to node t.
Hint 2
Find the path strings from root → s, and root → t. Can you use these two strings to prepare the final answer?
Hint 3
Remove the longest common prefix of the two path strings to get the path LCA → s, and LCA → t.
Each step in the path of LCA → s should be reversed as 'U'.
 */
// LCA + DFS (Optimized)
public class StepByStepDirectionsFromABinaryTreeNodeToAnother_2096 {

    public String getDirections(TreeNode root, int startValue, int destValue) {
        var startPath = new StringBuilder();
        var destPath = new StringBuilder();

        // Find paths from root to start and destination nodes
        findPath(root, startValue, startPath);
        findPath(root, destValue, destPath);

        var directions = new StringBuilder();
        int commonPathLength = 0;

        // Find the length of the common path
        while (
            commonPathLength < startPath.length() &&
                commonPathLength < destPath.length() &&
                startPath.charAt(commonPathLength) ==
                    destPath.charAt(commonPathLength)
        ) {
            commonPathLength++;
        }

        // Add "U" for each step to go up from start to common ancestor
        for (var i = 0; i < startPath.length() - commonPathLength; i++) {
            directions.append("U");
        }

        // Add directions from common ancestor to destination
        for (var i = commonPathLength; i < destPath.length(); i++) {
            directions.append(destPath.charAt(i));
        }

        return directions.toString();
    }

    private boolean findPath(TreeNode node, int target, StringBuilder path) {
        if (node == null) {
            return false;
        }

        if (node.val == target) {
            return true;
        }

        // Try left subtree
        path.append("L");
        if (findPath(node.left, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Remove last character

        // Try right subtree
        path.append("R");
        if (findPath(node.right, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1); // Remove last character

        return false;
    }

    // LCA + DFS
//    public String getDirections(TreeNode root, int startValue, int destValue) {
//        // Find the Lowest Common Ancestor (LCA) of start and destination nodes
//        var lowestCommonAncestor = findLowestCommonAncestor(
//            root,
//            startValue,
//            destValue
//        );
//
//        var pathToStart = new StringBuilder();
//        var pathToDest = new StringBuilder();
//
//        // Find paths from LCA to start and destination nodes
//        findPath(lowestCommonAncestor, startValue, pathToStart);
//        findPath(lowestCommonAncestor, destValue, pathToDest);
//
//        var directions = new StringBuilder();
//
//        // Add "U" for each step to go up from start to LCA
//        directions.append("U".repeat(pathToStart.length()));
//
//        // Append the path from LCA to destination
//        directions.append(pathToDest);
//
//        return directions.toString();
//    }
//
//    private TreeNode findLowestCommonAncestor(
//        TreeNode node,
//        int value1,
//        int value2
//    ) {
//        if (node == null) return null;
//
//        if (node.val == value1 || node.val == value2) return node;
//
//        var leftLCA = findLowestCommonAncestor(node.left, value1, value2);
//        var rightLCA = findLowestCommonAncestor(
//            node.right,
//            value1,
//            value2
//        );
//
//        if (leftLCA == null) return rightLCA;
//        else if (rightLCA == null) return leftLCA;
//        else return node; // Both values found, this is the LCA
//    }
//
//    private boolean findPath(
//        TreeNode node,
//        int targetValue,
//        StringBuilder path
//    ) {
//        if (node == null) return false;
//
//        if (node.val == targetValue) return true;
//
//        // Try left subtree
//        path.append("L");
//        if (findPath(node.left, targetValue, path)) {
//            return true;
//        }
//        path.setLength(path.length() - 1); // Remove last character
//
//        // Try right subtree
//        path.append("R");
//        if (findPath(node.right, targetValue, path)) {
//            return true;
//        }
//        path.setLength(path.length() - 1); // Remove last character
//
//        return false;
//    }

    // BFS + DFS
//    public String getDirections(TreeNode root, int startValue, int destValue) {
//        // Map to store parent nodes
//        var parentMap = new HashMap<Integer, TreeNode>();
//
//        // Find the start node and populate parent map
//        TreeNode startNode = findStartNode(root, startValue);
//        populateParentMap(root, parentMap);
//
//        // Perform BFS to find the path
//        var queue = new LinkedList<TreeNode>();
//        queue.add(startNode);
//        var visitedNodes = new HashSet<TreeNode>();
//        // Key: next node, Value: <current node, direction>
//        var pathTracker = new HashMap<TreeNode, AbstractMap.SimpleEntry<TreeNode, String>>();
//        visitedNodes.add(startNode);
//
//        while (!queue.isEmpty()) {
//            var currentNode = queue.poll();
//
//            // If destination is reached, return the path
//            if (currentNode.val == destValue) {
//                return backtrackPath(currentNode, pathTracker);
//            }
//
//            // Check and add parent node
//            if (parentMap.containsKey(currentNode.val)) {
//                var parentNode = parentMap.get(currentNode.val);
//                if (!visitedNodes.contains(parentNode)) {
//                    queue.add(parentNode);
//                    pathTracker.put(parentNode, new AbstractMap.SimpleEntry<>(currentNode, "U"));
//                    visitedNodes.add(parentNode);
//                }
//            }
//
//            // Check and add left child
//            if (
//                currentNode.left != null &&
//                    !visitedNodes.contains(currentNode.left)
//            ) {
//                queue.add(currentNode.left);
//                pathTracker.put(currentNode.left, new AbstractMap.SimpleEntry<>(currentNode, "L"));
//                visitedNodes.add(currentNode.left);
//            }
//
//            // Check and add right child
//            if (
//                currentNode.right != null &&
//                    !visitedNodes.contains(currentNode.right)
//            ) {
//                queue.add(currentNode.right);
//                pathTracker.put(currentNode.right, new AbstractMap.SimpleEntry<>(currentNode, "R"));
//                visitedNodes.add(currentNode.right);
//            }
//        }
//
//        // This line should never be reached if the tree is valid
//        return "";
//    }
//
//    private String backtrackPath(
//        TreeNode node,
//        Map<TreeNode, AbstractMap.SimpleEntry<TreeNode, String>> pathTracker
//    ) {
//        var path = new StringBuilder();
//
//        // Construct the path
//        while (pathTracker.containsKey(node)) {
//            // Add the directions in reverse order and move on to the previous node
//            path.append(pathTracker.get(node).getValue());
//            node = pathTracker.get(node).getKey();
//        }
//
//        // Reverse the path
//        path.reverse();
//
//        return path.toString();
//    }
//
//    private void populateParentMap(
//        TreeNode node,
//        Map<Integer, TreeNode> parentMap
//    ) {
//        if (node == null) return;
//
//        // Add children to the map and recurse further
//        if (node.left != null) {
//            parentMap.put(node.left.val, node);
//            populateParentMap(node.left, parentMap);
//        }
//
//        if (node.right != null) {
//            parentMap.put(node.right.val, node);
//            populateParentMap(node.right, parentMap);
//        }
//    }
//
//    private TreeNode findStartNode(TreeNode node, int startValue) {
//        if (node == null) return null;
//
//        if (node.val == startValue) return node;
//
//        var leftResult = findStartNode(node.left, startValue);
//
//        // If left subtree returns a node, it must be StartNode. Return it
//        // Otherwise, return whatever is returned by right subtree.
//        if (leftResult != null) return leftResult;
//        return findStartNode(node.right, startValue);
//    }
}
