package com.alex.andreiev.utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TreeNode)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        var node = (TreeNode) obj;
        if (this.val != node.val) {
            return false;
        }

        if (this.left == null && node.left != null) {
            return false;
        }

        if (this.left != null && !this.left.equals(node.left)) {
            return false;
        }

        if (this.right == null && node.right != null) {
            return false;
        }

        if (this.right != null && !this.right.equals(node.right)) {
            return false;
        }

        return true;
    }
}
