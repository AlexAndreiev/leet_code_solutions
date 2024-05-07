package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedList_876Test {

    @Test
    void middleNode() {
        var target = new MiddleOfTheLinkedList_876();
        var inputNode = ListNode.getNodes(1, 2, 3, 4, 5);
        var expectedNode = ListNode.getNodes (3, 4, 5);
        assertEquals(expectedNode, target.middleNode(inputNode));

        inputNode = ListNode.getNodes(1, 2, 3, 4, 5, 6);
        expectedNode = ListNode.getNodes(4, 5, 6);
        assertEquals(expectedNode, target.middleNode(inputNode));
    }
}