package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArray_215Test {

    @Test
    void findKthLargest() {
        var target = new KthLargestElementInAnArray_215();
        assertEquals(5, target.findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        assertEquals(4, target.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }
}