package com.alex.andreiev.utils;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}
