package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumOfALinkedList_2130Test {

    @Test
    void pairSum() {
        var target = new MaximumTwinSumOfALinkedList_2130();
//        var input = ListNode.getNodes(5, 4, 2, 1);
//        assertEquals(6, target.pairSum(input));
//
//        input = ListNode.getNodes (4, 2, 2, 3);
//        assertEquals(7, target.pairSum(input));
//
//        input = ListNode.getNodes(1, 100000);
//        assertEquals(100001, target.pairSum(input));


        var input = ListNode.getNodes(47,22,81,46,94,95,90,22,55,91,6,83,49,65,10,
            32,41,26,83,99,14,85,42,99,89,69,30,92,32,74,9,81,5,9);
        assertEquals(182, target.pairSum(input));
    }
}