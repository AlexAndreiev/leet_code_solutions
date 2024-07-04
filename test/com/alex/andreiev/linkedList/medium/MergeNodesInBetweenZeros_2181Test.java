package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeNodesInBetweenZeros_2181Test {

    @Test
    void mergeNodes() {
        var target = new MergeNodesInBetweenZeros_2181();
        var head = ListNode.getNodes(0, 3, 1,  0, 4, 5, 2, 0);
        assertEquals(ListNode.getNodes(4, 11), target.mergeNodes(head));

        head = ListNode.getNodes(0,1,0,3,0,2,2,0);
        assertEquals(ListNode.getNodes(1, 3, 4), target.mergeNodes(head));
    }
}