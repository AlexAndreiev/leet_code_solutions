package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTheMiddleNodeOfALinkedList_2095Test {

    @Test
    void deleteMiddle() {
        var target = new DeleteTheMiddleNodeOfALinkedList_2095();
        var input = new ListNode(1, new ListNode(3, new ListNode(4,
            new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        var expected = new ListNode(1, new ListNode(3, new ListNode(4,
            new ListNode(1, new ListNode(2, new ListNode(6))))));
        assertEquals(expected, target.deleteMiddle(input));

        input = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4))));
        expected = new ListNode(1, new ListNode(2, new ListNode(4)));
        assertEquals(expected, target.deleteMiddle(input));

        input = new ListNode(2, new ListNode(1));
        expected = new ListNode(2);
        assertEquals(expected, target.deleteMiddle(input));
    }
}