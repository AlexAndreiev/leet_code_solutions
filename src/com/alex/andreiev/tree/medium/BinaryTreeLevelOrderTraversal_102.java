package com.alex.andreiev.tree.medium;

import com.alex.andreiev.utils.TreeNode;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_102 {

    // recursive
    public List<List<Integer>> levelOrder(TreeNode root) {
        var list = new ArrayList<List<Integer>>();
        bfs(root, 0, list);
        return list;
    }

    void bfs(TreeNode node, int lv, List<List<Integer>> list) {
        if (node == null) {
            return;
        }

        List<Integer> l;
        if (list.size() - 1 < lv) {
            l = new ArrayList<>();
            list.add(l);
        } else {
            l = list.get(lv);
        }

        l.add(node.val);

        bfs(node.left, lv+1, list);
        bfs(node.right, lv+1, list);
    }

    // iterable
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        var list = new ArrayList<List<Integer>>();
//        var queue = new ArrayDeque<AbstractMap.SimpleEntry <Integer, TreeNode>>();
//        queue.offer(new AbstractMap.SimpleEntry<>(0, root));
//
//        while (!queue.isEmpty()) {
//            var pair = queue.poll();
//            var node = pair.getValue();
//            if (node == null) {
//                continue;
//            }
//
//            var k = pair.getKey();
//            List<Integer> l;
//            if (list.size() - 1 < k) {
//                l = new ArrayList<>();
//                list.add(l);
//            } else {
//                l = list.get(k);
//            }
//
//            l.add(node.val);
//
//            queue.offer(new AbstractMap.SimpleEntry<>(k+1, node.left));
//            queue.offer(new AbstractMap.SimpleEntry<>(k+1, node.right));
//        }
//
//        return list;
//    }
}
