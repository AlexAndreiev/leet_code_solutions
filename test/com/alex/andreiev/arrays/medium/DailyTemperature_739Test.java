package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperature_739Test {

    @Test
    void dailyTemperatures() {
        var target = new DailyTemperature_739();
        assertArrayEquals(new int[] {1,1,4,2,1,1,0,0},
            target.dailyTemperatures(new int[] {73,74,75,71,69,72,76,73}));

        assertArrayEquals(new int[] {1,1,1,0},
            target.dailyTemperatures(new int[] {30,40,50,60}));

        assertArrayEquals(new int[] {1,1,0},
            target.dailyTemperatures(new int[] {30,60,90}));
    }
}