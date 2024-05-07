package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLists_21Test {

    @Test
    void mergeTwoLists() {
        var l1 = ListNode.getNodes(1, 2, 4);
        var l2 = ListNode.getNodes (1, 3, 4);
        var target = new MergeTwoSortedLists_21();
        var list = target.mergeTwoLists(l1, l2);
        checkList(list, new int[]{1, 1, 2, 3, 4});

        list = target.mergeTwoLists(null, null);
        checkList(list, null);

        l1 = new ListNode(0);
        list = target.mergeTwoLists(l1, null);
        checkList(list, new int[]{0});

    }

    private void checkList(ListNode list, int[] expectedArr) {
        if (expectedArr == null) {
            assertNull(list);
            return;
        }

        var tmpList = list;
        for (var val: expectedArr) {
            assertEquals(val, tmpList.val);
            tmpList = tmpList.next;
        }
    }
}