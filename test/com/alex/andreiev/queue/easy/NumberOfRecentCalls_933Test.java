package com.alex.andreiev.queue.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCalls_933Test {

    @Test
    void ping() {
        var target = new NumberOfRecentCalls_933();
        assertEquals(1, target.ping(1));
        assertEquals(2, target.ping(100));
        assertEquals(3, target.ping(3001));
        assertEquals(3, target.ping(3002));
    }
}