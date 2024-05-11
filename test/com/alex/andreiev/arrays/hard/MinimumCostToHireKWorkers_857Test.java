package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostToHireKWorkers_857Test {

    @Test
    void mincostToHireWorkers() {
        var target = new MinimumCostToHireKWorkers_857();
        assertEquals(105,
            target.mincostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2));
        assertEquals(30.66667,
            target.mincostToHireWorkers(new int[]{3,1,10,10,1}, new int[]{4,8,2,2,7}, 3));
        assertEquals(1979.31429,
            target.mincostToHireWorkers(new int[]{25,68,35,62,52,57,35,83,40,51},
                new int[]{147,97,251,129,438,443,120,366,362,343}, 6));
    }
}