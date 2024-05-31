package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumber3_260Test {

    @Test
    void singleNumber() {
        var target = new SingleNumber3_260();
        var actual = target.singleNumber(new int[] {1,2,1,3,2,5});
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == 3));
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == 5));

        actual = target.singleNumber(new int[] {-1, 0});
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == -1));
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == 0));

        actual = target.singleNumber(new int[] {0, 1});
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == 1));
        assertTrue(Arrays.stream(actual).anyMatch(i -> i == 0));
    }
}