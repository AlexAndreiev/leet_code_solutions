package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycle_easy_141Test {

    @Test
    void hasCycle() {
        var target = new LinkedListCycle_easy_141();
        // 3 -> 2 -> 0 -> -4
        //      ^----------^
        var cycledNode = new ListNode(2);
        var pointerNode = new ListNode(-4);
        pointerNode.next = cycledNode;
        var head = new ListNode(3);
        head.next = cycledNode;
        cycledNode.next = new ListNode(0);
        cycledNode.next.next = pointerNode;
        int pos = 1;
        assertTrue(target.hasCycle(head));

        // 1 -> 2
        // ^----^
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        pos = 0;
        assertTrue(target.hasCycle(head));

        head = new ListNode(1);
        pos = -1;
        assertFalse(target.hasCycle(head));
    }
}