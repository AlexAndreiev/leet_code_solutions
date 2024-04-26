package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceOfTwoArrays_2215Test {

    @Test
    void findDifference() {
        var target = new FindTheDifferenceOfTwoArrays_2215();
        assertIterableEquals(List.of(List.of(1, 3), List.of(4, 6)),
            target.findDifference(new int[] {1, 2, 3}, new int[] {2, 4, 6}));

        assertIterableEquals(List.of(List.of(3), List.of()),
            target.findDifference(new int[] {1, 2, 3, 3}, new int[] {1, 1, 2, 2}));
    }
}