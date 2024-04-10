package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;

/*You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Constraints:
    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.
*/
public class AddTwoNumbers_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /* Approach 1
            Time complexity - O(n)
            Space complexity - O(n+1)
         */

        if (l1 == null && l2 == null) return null;

        var sum = new ListNode(0);
        var workPointer = sum;
        int extra = 0;
        while (l1 != null || l2 != null) {
            int tmpSum = extra;
            if (l1 != null) {
                tmpSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                tmpSum += l2.val;
                l2 = l2.next;
            }
            extra = tmpSum / 10;
            workPointer.next = new ListNode(tmpSum % 10);
            workPointer = workPointer.next;
        }
        if (extra != 0)
            workPointer.next = new ListNode(extra);
        return sum.next;
    }
}
