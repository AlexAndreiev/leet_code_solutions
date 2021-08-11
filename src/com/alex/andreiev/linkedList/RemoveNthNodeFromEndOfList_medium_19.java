package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;

/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Constraints:
    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz

Follow up: Could you do this in one pass?

Hint 1: Maintain two pointers and update one with a delay of n steps.
*/
public class RemoveNthNodeFromEndOfList_medium_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        /* Approach 1
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */
/*
        var slow = head;
        var fast = head;
        while (fast != null) {
            if (n < 0)
                slow = slow.next;
            else
                n--;
            fast = fast.next;
        }
        if (slow.next == null) return null;
        slow.next = slow.next.next;
        return head;
*/
        /* Approach 2
         * Time complexity - O(n)
         * Space complexity - O(1)
         * */
        var dummy = new ListNode(0);
        dummy.next = head;
        var slow = dummy;
        var fast = dummy;
        while (n >= 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
