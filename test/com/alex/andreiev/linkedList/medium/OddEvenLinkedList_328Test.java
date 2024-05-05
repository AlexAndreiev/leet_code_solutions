package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedList_328Test {

    @Test
    void oddEvenList() {
        var target = new OddEvenLinkedList_328();
        var input = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5)))));
        var expected = new ListNode(1, new ListNode(3, new ListNode(5,
            new ListNode(2, new ListNode(4)))));
        assertEquals(expected, target.oddEvenList(input));


        input = new ListNode(2, new ListNode(1, new ListNode(3,
            new ListNode(5, new ListNode(6, new ListNode(4,
                new ListNode(7)))))));
        expected = new ListNode(2, new ListNode(3, new ListNode(6,
            new ListNode(7, new ListNode(1, new ListNode(5,
                new ListNode(4)))))));
        assertEquals(expected, target.oddEvenList(input));

        assertNull(target.oddEvenList(null));
        assertEquals(new ListNode(1), target.oddEvenList(new ListNode(1)));

    }
}