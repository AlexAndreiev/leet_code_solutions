package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollision_735Test {

    @Test
    void asteroidCollision() {
        var target = new AsteroidCollision_735();
        assertArrayEquals(new int[] {5, 10}, target.asteroidCollision(new int[] {5, 10, -5}));
        assertArrayEquals(new int[] {}, target.asteroidCollision(new int[] {8, -8}));
        assertArrayEquals(new int[] {10}, target.asteroidCollision(new int[] {10, 2, -5}));
    }
}