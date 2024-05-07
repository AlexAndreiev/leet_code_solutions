package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedList_328Test {

    @Test
    void oddEvenList() {
        var target = new OddEvenLinkedList_328();
        var input = ListNode.getNodes(1, 2, 3, 4, 5);
        var expected = ListNode.getNodes(1, 3, 5, 2, 4);
        assertEquals(expected, target.oddEvenList(input));


        input = ListNode.getNodes(2, 1, 3, 5, 6, 4, 7);
        expected = ListNode.getNodes(2, 3, 6, 7, 1, 5, 4);
        assertEquals(expected, target.oddEvenList(input));

        assertNull(target.oddEvenList(null));
        assertEquals(new ListNode(1), target.oddEvenList(new ListNode(1)));

    }
}