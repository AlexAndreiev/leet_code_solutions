package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.LinkedListUtils;
import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfList_19Test {

    @Test
    void removeNthFromEnd() {
        var target = new RemoveNthNodeFromEndOfList_19();
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head = target.removeNthFromEnd(head, 2);
        var expected = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, head));

        head = new ListNode(1);
        head = target.removeNthFromEnd(head, 1);
        assertNull(head);

        head = new ListNode(1, new ListNode(2));
        head = target.removeNthFromEnd(head, 1);
        expected = new ListNode(1);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, head));
    }
}