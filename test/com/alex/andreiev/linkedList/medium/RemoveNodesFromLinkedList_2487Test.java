package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RemoveNodesFromLinkedList_2487Test {

    @Test
    void removeNodes() {
        var target = new RemoveNodesFromLinkedList_2487();
        var input = new ListNode(5, new ListNode(2, new ListNode(13,
            new ListNode(3, new ListNode(8)))));
        var expected = new ListNode(13, new ListNode(8));
        assertEquals(expected, target.removeNodes(input));

        input = new ListNode(1, new ListNode(1, new ListNode(1,
            new ListNode(1))));
        expected = new ListNode(1, new ListNode(1, new ListNode(1,
            new ListNode(1))));
        assertEquals(expected, target.removeNodes(input));
    }
}