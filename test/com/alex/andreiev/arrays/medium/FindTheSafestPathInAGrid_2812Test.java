package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSafestPathInAGrid_2812Test {

    @Test
    void maximumSafenessFactor() {
        var target = new FindTheSafestPathInAGrid_2812();
        assertEquals(0, target.maximumSafenessFactor(List.of(
            List.of(1, 0, 0),
            List.of(0, 0, 0),
            List.of(0, 0, 1)
        )));

        assertEquals(2, target.maximumSafenessFactor(List.of(
            List.of(1, 0, 1),
            List.of(0, 0, 0),
            List.of(0, 0, 0)
        )));

        assertEquals(2, target.maximumSafenessFactor(List.of(
            List.of(0, 0, 0, 1),
            List.of(0, 0, 0, 0),
            List.of(0, 0, 0, 0),
            List.of(1, 0, 0, 0)
        )));
    }
}