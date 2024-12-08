package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, imagine yourself standing on the right side of it,
return the values of the nodes you can see ordered from top to bottom.

Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Explanation:

Example 2:
Input: root = [1,2,3,4,null,null,null,5]
Output: [1,3,4,5]
Explanation:

Example 3:
Input: root = [1,null,3]
Output: [1,3]

Example 4:
Input: root = []
Output: []

Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
 */
public class BinaryTreeRightSideView_199 {

    private int maxLevel;

    public List<Integer> rightSideView(TreeNode root) {
        var result = new ArrayList<Integer>();
        maxLevel = -1;
        bfs(root, 0, result);
        return result;
    }

    private void bfs(TreeNode root, int curLevel, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (curLevel > maxLevel) {
            list.add(root.val);
            maxLevel++;
        }

        if (root.right != null) {
            bfs(root.right, curLevel + 1, list);
        }

        if (root.left != null) {
            bfs(root.left, curLevel + 1, list);
        }
    }
}
