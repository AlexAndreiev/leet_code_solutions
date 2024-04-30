package com.alex.andreiev.graph.medium;

import com.alex.andreiev.utils.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraph_133Test {

    @Test
    void cloneGraph() {
        var target = new CloneGraph_133();

        var node1 = new Node(1);
        var node2 = new Node(2);
        var node3 = new Node(3);
        var node4 = new Node(4);
        var expectedMap = new HashMap<Integer, Node>();
        expectedMap.put(node1.val, node1);
        expectedMap.put(node2.val, node2);
        expectedMap.put(node3.val, node3);
        expectedMap.put(node4.val, node4);

        node1.neighbors = List.of(node2, node4);
        node2.neighbors = List.of(node1, node3);
        node3.neighbors = List.of(node2, node4);
        node4.neighbors = List.of(node1, node3);

        var actual = target.cloneGraph(node1);

        var visited = new HashSet<Integer>();
        var queue = new ArrayDeque<Node>();
        queue.offer(actual);
        while (!queue.isEmpty()) {
            var actualNode = queue.poll();
            if (visited.contains(actualNode.val)) {
                continue;
            }
            checkNode(actualNode, expectedMap.get(actualNode.val));
            visited.add(actualNode.val);
            for (var n : actualNode.neighbors) {
                queue.offer(n);
            }
        }
    }

    void checkNode(Node actualNode, Node expectedNode) {
        assertNotSame(actualNode, expectedNode);
        assertEquals(expectedNode.val, actualNode.val);
        assertIterableEquals(expectedNode.neighbors.stream().map(n -> n.val).toList(),
            actualNode.neighbors.stream().map(n -> n.val).toList());
    }
}