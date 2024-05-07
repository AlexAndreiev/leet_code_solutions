package com.alex.andreiev.linkedList.easy;

import com.alex.andreiev.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedList_234Test {

    @Test
    void isPalindrome() {
        var target = new PalindromeLinkedList_234();
        var head = ListNode.getNodes(1, 2, 2, 1);
        assertTrue(target.isPalindrome(head));

        head = ListNode.getNodes(1, 2, 3, 2, 1);
        assertTrue(target.isPalindrome(head));

        head = ListNode.getNodes(1, 2);
        assertFalse(target.isPalindrome(head));
    }
}