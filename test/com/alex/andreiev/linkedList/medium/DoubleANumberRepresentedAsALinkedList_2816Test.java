package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleANumberRepresentedAsALinkedList_2816Test {

    @Test
    void doubleIt() {
        var target = new DoubleANumberRepresentedAsALinkedList_2816();
        var input = ListNode.getNodes(1, 8, 9);
        var expected = ListNode.getNodes(3, 7, 8);
        assertEquals(expected, target.doubleIt(input));

        input = ListNode.getNodes(9, 9, 9);
        expected = ListNode.getNodes(1, 9, 9, 8);
        assertEquals(expected, target.doubleIt(input));
    }
}