package com.alex.andreiev.utils;

public class LinkedListUtils {

    public static boolean isLinkedListEqual(ListNode expected, ListNode actual) {
        if (expected == null || actual == null) return false;
        while (expected != null) {
            if (actual == null) return false;
            if (expected.val != expected.val) return false;
            expected = expected.next;
            actual = actual.next;
        }
        if (actual != null) return false;
        return true;
    }
}
