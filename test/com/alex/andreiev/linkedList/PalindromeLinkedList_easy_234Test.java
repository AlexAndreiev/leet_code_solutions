package com.alex.andreiev.linkedList;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedList_easy_234Test {

    @Test
    void isPalindrome() {
        var target = new PalindromeLinkedList_easy_234();
        var head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        assertTrue(target.isPalindrome(head));

        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        assertTrue(target.isPalindrome(head));

        head = new ListNode(1, new ListNode(2));
        assertFalse(target.isPalindrome(head));
    }
}