package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWater_42Test {

    @Test
    void trap() {
        var target = new TrappingRainWater_42();
        assertEquals(3, target.trap(new int[]{2,1,0,2}));
        assertEquals(6, target.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(9, target.trap(new int[]{4,2,0,3,2,5}));
    }
}