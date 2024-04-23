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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ListNode)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        var node = (ListNode) obj;

        if (this.val != node.val) {
            return false;
        }

        if (this.next == null && node.next != null) {
            return false;
        }

        if (this.next != null && !this.next.equals(node.next)) {
            return false;
        }

        return true;
    }
}
