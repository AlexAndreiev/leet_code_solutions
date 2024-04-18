package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWater_11Test {

    @Test
    void maxArea() {
        var target = new ContainerWithMostWater_11();
        assertEquals(49, target.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        assertEquals(1, target.maxArea(new int[] {1,1}));
    }
}