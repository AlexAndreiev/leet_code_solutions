package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestPrimeFraction_786Test {

    @Test
    void kthSmallestPrimeFraction() {
        var target = new KthSmallestPrimeFraction_786();
        assertArrayEquals(new int[]{2, 5},
            target.kthSmallestPrimeFraction(new int[] {1, 2, 3, 5}, 3));
//        assertArrayEquals(new int[]{1, 7},
//            target.kthSmallestPrimeFraction(new int[] {1, 7}, 1));

    }
}