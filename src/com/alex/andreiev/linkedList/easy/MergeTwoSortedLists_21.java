package com.alex.andreiev.linkedList.easy;


import com.alex.andreiev.utils.ListNode;

public class MergeTwoSortedLists_21 {

    /*
        Merge two sorted linked lists and return it as a sorted list.
        The list should be made by splicing together the nodes of the first two lists.

        Constraints:
            * The number of nodes in both lists is in the range [0, 50].
            * -100 <= Node.val <= 100
            * Both l1 and l2 are sorted in non-decreasing order.
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
/*
        Approach 1
        Time complexity - O(n)
        Space complexity - O(n)
*/
/*
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode l;
        if (l1.val < l2.val)
            l = new ListNode(l1.val, mergeTwoLists(l1.next, l2));
        else
            l = new ListNode(l2.val, mergeTwoLists(l1, l2.next));
        return l;
*/

/*
        Approach 2
        Time complexity - O(n)
        Space complexity - O(n)
*/
        var preHead = new ListNode(0);
        var curNode = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }

        if (l1 != null) { curNode.next = l1; }
        if (l2 != null) { curNode.next = l2; }

        return preHead.next;
    }
}
