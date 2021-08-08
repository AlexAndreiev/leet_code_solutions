package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class IntersectionOfTwoArrays2_easy_350Test {

    @Test
    void intersect() {
        var target = new IntersectionOfTwoArrays2_easy_350();
        assertArrayEquals(new int[] {2, 2}, target.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        var result = target.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
//        Explanation: [9,4] is also accepted.
        assertTrue(Arrays.equals(new int[] {4, 9}, result) || Arrays.equals(new int[] {9, 4}, result));
    }
}