package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandies_1431Test {

    @Test
    void kidsWithCandies() {
        var target = new KidsWithTheGreatestNumberOfCandies_1431();
        assertEquals(List.of(true, true, true, false, true),
            target.kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3));
        assertEquals(List.of(true, false, false, false, false),
            target.kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1));
        assertEquals(List.of(true, false, true),
            target.kidsWithCandies(new int[] {12, 1, 12}, 10));
    }
}