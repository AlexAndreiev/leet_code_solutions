package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeter_463Test {

    @Test
    void islandPerimeter() {
        var target = new IslandPerimeter_463();
        assertEquals(16, target.islandPerimeter(
            new int[][] {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
            }
            ));

        assertEquals(4, target.islandPerimeter(
            new int[][] {
                {1}
            }
        ));

        assertEquals(4, target.islandPerimeter(
            new int[][] {
                {1, 0}
            }
        ));
    }
}