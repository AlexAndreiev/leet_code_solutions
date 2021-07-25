package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;

/*
Given the head of a singly linked list, return true if it is a palindrome.
Constraints:
    The number of nodes in the list is in the range [1, 105].
    0 <= Node.val <= 9
Follow up: Could you do it in O(n) time and O(1) space?
*/

public class PalindromeLinkedList_easy_234 {

    /*
        Approach 1
        Time complexity - O(n)
        Space complexity - O(1)
    */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);

        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            var next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
