package com.alex.andreiev.linkedList.medium;


import com.alex.andreiev.utils.LinkedListUtils;
import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers_2Test {

    @Test
    void addTwoNumbers() {
        var target = new AddTwoNumbers_2();

        var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        Explanation: 342 + 465 = 807.
        var expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        var actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));

        l1 = new ListNode(0);
        l2 = new ListNode(0);
        expected = new ListNode(0);
        actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));

        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9)))))));
        l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        expected = new ListNode(0, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        actual = target.addTwoNumbers(l1, l2);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));
    }
}