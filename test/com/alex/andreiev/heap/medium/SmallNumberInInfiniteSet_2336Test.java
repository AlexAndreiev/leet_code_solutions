package com.alex.andreiev.heap.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallNumberInInfiniteSet_2336Test {

    @Test
    void popSmallest() {
        var target = new SmallNumberInInfiniteSet_2336();
        target.addBack(2);
        assertEquals(1, target.popSmallest());
        assertEquals(2, target.popSmallest());
        assertEquals(3, target.popSmallest());
        target.addBack(1);
        assertEquals(1, target.popSmallest());
        assertEquals(4, target.popSmallest());
        assertEquals(5, target.popSmallest());
    }
}