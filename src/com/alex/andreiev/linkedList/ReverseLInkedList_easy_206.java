package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;

// Given the head of a singly linked list, reverse the list, and return the reversed list.
public class ReverseLInkedList_easy_206 {

    public ListNode reverseList(ListNode head) {
/*
        Approach 1
        Time Complexity - O(n)
        Space complexity - O(1)
*/
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            var tmpNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmpNode;
        }
        return prev;
        /*
         * Approach 2
         * Time complexity - O(n)
         * Space complexity - O(n)
         * */
//        if (head == null) return null;
//        var reversedList = new ListNode();
//        reverse(head, reversedList);
//        return reversedList;
    }

    public ListNode reverse(ListNode node, ListNode newNode) {
        if (node.next == null) {
            newNode.val = node.val;
            return newNode;
        }
        var next = reverse(node.next, newNode);
        next.next = new ListNode(node.val);
        return next.next;
    }
}
