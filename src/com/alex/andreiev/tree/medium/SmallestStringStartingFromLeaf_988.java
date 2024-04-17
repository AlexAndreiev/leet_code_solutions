package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;

public class SmallestStringStartingFromLeaf_988 {

    String smallestStr = "";

    public String smallestFromLeaf(TreeNode root) {
        var sb = new StringBuilder();
        dfs(root, sb);
        return smallestStr;
    }

    void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        sb.insert(0, (char)(node.val + 'a'));
        if (node.left == null && node.right == null) {
            if (smallestStr.isEmpty() || sb.toString().compareTo(smallestStr) < 0) {
                smallestStr = sb.toString();
            }
        }

        dfs(node.left, sb);
        dfs(node.right, sb);

        sb.deleteCharAt(0);
    }
}
