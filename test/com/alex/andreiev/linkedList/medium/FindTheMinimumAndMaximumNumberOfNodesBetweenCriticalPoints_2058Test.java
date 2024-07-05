package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_2058Test {

    @Test
    void nodesBetweenCriticalPoints() {
        var target = new FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_2058();
        assertArrayEquals(new int[] {-1,-1}, target.nodesBetweenCriticalPoints(
                ListNode.getNodes(3,1)));

        assertArrayEquals(new int[] {1,3}, target.nodesBetweenCriticalPoints(
                ListNode.getNodes(5,3,1,2,5,1,2)));

        assertArrayEquals(new int[] {3,3}, target.nodesBetweenCriticalPoints(
                ListNode.getNodes(1,3,2,2,3,2,2,2,7)));

        assertArrayEquals(new int[] {1,1}, target.nodesBetweenCriticalPoints(
                ListNode.getNodes(4,2,4,1)));
    }
}