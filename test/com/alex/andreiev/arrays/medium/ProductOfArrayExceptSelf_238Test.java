package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelf_238Test {

    @Test
    void productExceptSelf() {
        var target = new ProductOfArrayExceptSelf_238();
        assertArrayEquals(new int[] {24, 12, 8, 6}, target.productExceptSelf(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[] {0, 0, 9,0, 0}, target.productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}