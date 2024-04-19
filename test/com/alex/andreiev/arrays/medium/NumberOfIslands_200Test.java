package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslands_200Test {

    @Test
    void numIslands() {
        var target = new NumberOfIslands_200();
        assertEquals(1, target.numIslands(
            new char[][] {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
            })
        );

        assertEquals(3, target.numIslands(
            new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
            })
        );
    }
}