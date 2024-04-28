package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignCircularQueue_622Test {

    @Test
    void enQueue() {
         var queue = new DesignCircularQueue_622(3);
        assertTrue(queue.enQueue(1));
        assertTrue(queue.enQueue(2));
        assertTrue(queue.enQueue(3));
        assertFalse(queue.enQueue(4));
        assertEquals(3, queue.Rear());
        assertTrue(queue.isFull());
        assertTrue(queue.deQueue());
        assertTrue(queue.enQueue(4));
        assertEquals(4, queue.Rear());
    }
}