package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.LinkedListUtils;
import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLInkedList_206Test {

    @Test
    void reverseList() {
        var target = new ReverseLInkedList_206();
        var root = ListNode.getNodes(1, 2, 3, 4, 5);
        var actual = target.reverseList(root);
        var expected = ListNode.getNodes(5, 4, 3, 2, 1);
        assertTrue(LinkedListUtils.isLinkedListEqual(expected, actual));
    }
}