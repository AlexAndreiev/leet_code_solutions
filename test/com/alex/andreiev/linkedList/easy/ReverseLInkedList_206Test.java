package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.LinkedListUtils;
import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLInkedList_206Test {

    @Test
    void reverseList() {
        var target = new ReverseLInkedList_206();
        var root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var actual = target.reverseList(root);
        var expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));
    }
}