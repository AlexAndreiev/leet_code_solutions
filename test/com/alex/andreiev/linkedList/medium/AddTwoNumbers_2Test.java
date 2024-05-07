package com.alex.andreiev.linkedList.medium;


import com.alex.andreiev.utils.LinkedListUtils;
import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers_2Test {

    @Test
    void addTwoNumbers() {
        var target = new AddTwoNumbers_2();

        var l1 = ListNode.getNodes(2, 4, 3);
        var l2 = ListNode.getNodes(5, 6, 4);
//        Explanation: 342 + 465 = 807.
        var expected = ListNode.getNodes(7, 0, 8);
        var actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        expected = new ListNode(0);
        actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));

        l1 = ListNode.getNodes(9, 9, 9, 9, 9, 9, 9);
        l2 = ListNode.getNodes(9, 9, 9, 9);
        expected = ListNode.getNodes(0, 9, 9, 9, 0, 0, 0, 1);
        actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));
    }
}