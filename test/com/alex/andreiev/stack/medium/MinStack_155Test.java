package com.alex.andreiev.stack.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStack_155Test {

    @Test
    void push() {
        var stack = new MinStack_155();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3, stack.getMin());
        stack.pop();
        assertEquals(0, stack.top());
        assertEquals(-2, stack.getMin());
    }
}