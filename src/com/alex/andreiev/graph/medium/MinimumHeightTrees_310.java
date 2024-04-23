package com.alex.andreiev.graph.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
A tree is an undirected graph in which any two vertices are connected by exactly one path.
In other words, any connected graph without simple cycles is a tree.
Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges
where edges[i] = [ai, bi] indicates that there is an undirected edge between the two nodes ai and bi in the tree,
you can choose any node of the tree as the root.
When you select a node x as the root, the result tree has height h.
Among all possible rooted trees, those with minimum height (i.e. min(h))  are called minimum height trees (MHTs).

Return a list of all MHTs' root labels. You can return the answer in any order.
The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.

Example 1:
Input: n = 4, edges = [[1,0],[1,2],[1,3]]
Output: [1]
Explanation: As shown, the height of the tree is 1 when the root is the node with label 1 which is the only MHT.

Example 2:
Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
Output: [3,4]

Constraints:
    1 <= n <= 2 * 104
    edges.length == n - 1
    0 <= ai, bi < n
    ai != bi
    All the pairs (ai, bi) are distinct.
    The given input is guaranteed to be a tree and there will be no repeated edges.

Hint 1
How many MHTs can a graph have at most?
 */

public class MinimumHeightTrees_310 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0);
        }

        var indexes = new int[n];
        var map = new HashMap<Integer, List<Integer>>(n);
        for (var edge : edges) {
            indexes[edge[0]]++;
            indexes[edge[1]]++;

            map.putIfAbsent(edge[0], new ArrayList<>());
            map.putIfAbsent(edge[1], new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        // put leaf nodes on the queue
        var queue = new LinkedList<Integer>();
        for (var i = 0; i < n; i++) {
            if (indexes[i] == 1) {
                queue.add(i);
            }
        }

        var processed = 0;
        // we have have max 2 MHT (because it should be a center)
        while (n - processed > 2) {
            var size = queue.size();
            processed += size;
            // removing leaves
            for (var i = 0; i < size; i++) {
                var poll = queue.poll();
                for (var adj : map.get(poll)) {
                    if (--indexes[adj] == 1) {
                        queue.add(adj);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
