package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllGroupsOfFarmland_1992Test {

    @Test
    void findFarmland() {
        var target = new FindAllGroupsOfFarmland_1992();
        assertArrayEquals(new int[][] {
            {0,0,0,0},
            {1,1,2,2}
        }, target.findFarmland(new int[][] {
            {1,0,0},
            {0,1,1},
            {0,1,1}
        }));

        assertArrayEquals(new int[][] {
            {0,0,1,1}
        }, target.findFarmland(new int[][] {
            {1,1},
            {1,1}
        }));

        assertArrayEquals(new int[][] {},
            target.findFarmland(new int[][] {{0}}));
    }
}