package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;

import java.util.Stack;

/*
You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
Return the head of the linked list after doubling it.

Example 1:
Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189.
Hence, the returned linked list represents the number 189 * 2 = 378.

Example 2:
Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999.
Hence, the returned linked list represents the number 999 * 2 = 1998.

Constraints:
    The number of nodes in the list is in the range [1, 104]
    0 <= Node.val <= 9
    The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.

Hint 1
Traverse the linked list from the least significant digit to the most significant digit and multiply each node's value by 2
Hint 2
Handle any carry-over digits that may arise during the doubling process.
Hint 3
If there is a carry-over digit on the most significant digit,
create a new node with that value and point it to the start of the given linked list and return it.
 */


public class DoubleANumberRepresentedAsALinkedList_2816 {
    // single pointer
    public ListNode doubleIt(ListNode head) {
        var cur = head;
        if (head.val > 4) {
            head = new ListNode(1, head);
            cur = head.next;
        }

        while (cur != null) {
            cur.val = (cur.val * 2) % 10;
            if (cur.next != null && cur.next.val > 4) {
                cur.val++;
            }
            cur = cur.next;
        }


        return head;
    }


    // two pointers
    // 2 ms
//    public ListNode doubleIt(ListNode head) {
//        head.val *= 2;
//
//        var prev = head;
//        var cur = head.next;
//        while (cur != null) {
//            cur.val *= 2;
//            if (cur.val > 9) {
//                prev.val += 1;
//            }
//            cur.val %= 10;
//            prev = cur;
//            cur = cur.next;
//        }
//
//        if (head.val > 9) {
//            var val = head.val;
//            head.val = val % 10;
//            head = new ListNode(val / 10, head);
//        }
//
//        return head;
//    }


    // reversing
    // 5 ms
//    public ListNode doubleIt(ListNode head) {
//        head = reverse(head);
//        var carry = 0;
//        var curNode = head;
//        ListNode prev = null;
//        while (curNode != null) {
//            var tmpVal = (curNode.val * 2) + carry;
//            curNode.val = tmpVal % 10;
//            carry = tmpVal / 10;
//            prev = curNode;
//            curNode = curNode.next;
//        }
//
//        if (carry != 0) {
//            prev.next = new ListNode(carry);
//        }
//
//        return reverse(head);
//    }
//
//    ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        while (head != null) {
//            var tmp = head.next;
//            head.next = prev;
//            prev = head;
//            head = tmp;
//        }
//        return prev;
//    }
    // recursion
    // 4 ms
//    public ListNode doubleIt(ListNode head) {
//        var carry = multiply(head);
//        return carry == 0 ? head : new ListNode(carry, head);
//    }
//
//    int multiply(ListNode node) {
//        if (node == null) {
//            return 0;
//        }
//
//        var newValue = multiply(node.next) + (node.val * 2);
//        node.val = newValue % 10;
//        return newValue / 10;
//    }


    // stack
    // 19 ms
//    public ListNode doubleIt(ListNode head) {
//        var origin = head;
//        var stack = new Stack<ListNode>();
//        while (head != null) {
//            stack.push(head);
//            head = head.next;
//        }
//
//        var carry = 0;
//        while (!stack.isEmpty()) {
//            var node = stack.pop();
//            var newValue = (node.val * 2) + carry;
//            node.val = newValue % 10;
//            carry = newValue / 10;
//        }
//
//        return carry == 0 ? origin : new ListNode(carry, origin);
//    }
}
