package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeInALinkedList_easy_237Test {

    @Test
    void deleteNode() {
        var target = new DeleteNodeInALinkedList_easy_237();

//      Explanation: You are given the second node with value 5,
//      the linked list should become 4 -> 1 -> 9 after calling your function.
        var head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        target.deleteNode(head.next);
        checkNodeSequence(head, new int[] {4, 1, 9});

//      Explanation: You are given the third node with value 1,
//      the linked list should become 4 -> 5 -> 9 after calling your function.
        head = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        target.deleteNode(head.next.next);
        checkNodeSequence(head, new int[] {4, 5, 9});

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        target.deleteNode(head.next.next);
        checkNodeSequence(head, new int[] {1, 2, 4});

        head = new ListNode(0, new ListNode(1));
        target.deleteNode(head);
        checkNodeSequence(head, new int[] {1});

        head = new ListNode(-3, new ListNode(5, new ListNode(-99)));
        target.deleteNode(head);
        checkNodeSequence(head, new int[] {5, -99});
    }

    private void checkNodeSequence(ListNode head, int[] expectedValues) {
        for (var val : expectedValues) {
            assertEquals(val, head.val);
            head = head.next;
        }
        if (head != null)
            throw new RuntimeException("List is longer than expected values array");
    }
}