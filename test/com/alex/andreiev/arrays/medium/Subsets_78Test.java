package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Subsets_78Test {

    @Test
    void subsets() {
        var target = new Subsets_78();
        var actual = target.subsets(new int[]{1, 2, 3});
        List<List<Integer>> expected = List.of(
            List.of(),
            List.of(1),
            List.of(2),
            List.of(1, 2),
            List.of(3),
            List.of(1, 3),
            List.of(2, 3),
            List.of(1, 2, 3)
        );

        assertEquals(expected.size(), actual.size());
        for (var l : expected) {
            assertTrue(actual.stream().anyMatch(l1 -> l.containsAll(l)));
        }
    }
}