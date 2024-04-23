package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedList_876Test {

    @Test
    void middleNode() {
        var target = new MiddleOfTheLinkedList_876();
        var inputNode = new ListNode(1, new ListNode(2,
            new ListNode(3, new ListNode(4, new ListNode(5)))));
        var expectedNode = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertEquals(expectedNode, target.middleNode(inputNode));

        inputNode = new ListNode(1, new ListNode(2, new ListNode(3,
            new ListNode(4, new ListNode(5, new ListNode(6))))));
        expectedNode = new ListNode(4, new ListNode(5, new ListNode(6)));
        assertEquals(expectedNode, target.middleNode(inputNode));
    }
}