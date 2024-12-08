package com.alex.andreiev.dynamic.programming.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBits_338Test {

    @Test
    void countBits() {
        var target = new CountingBits_338();
        assertArrayEquals(new int[]{0, 1, 1}, target.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, target.countBits(5));
    }
}