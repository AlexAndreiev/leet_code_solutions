package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTheMiddleNodeOfALinkedList_2095Test {

    @Test
    void deleteMiddle() {
        var target = new DeleteTheMiddleNodeOfALinkedList_2095();
        var input = ListNode.getNodes(1, 3, 4, 7, 1, 2, 6);
        var expected = ListNode.getNodes(1, 3, 4, 1, 2, 6);
        assertEquals(expected, target.deleteMiddle(input));

        input = ListNode.getNodes(1, 2, 3, 4);
        expected = ListNode.getNodes(1, 2, 4);
        assertEquals(expected, target.deleteMiddle(input));

        input = ListNode.getNodes(2, 1);
        expected = new ListNode(2);
        assertEquals(expected, target.deleteMiddle(input));
    }
}