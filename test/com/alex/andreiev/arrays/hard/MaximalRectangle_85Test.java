package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalRectangle_85Test {

    @Test
    void maximalRectangle() {
        var target = new MaximalRectangle_85();
        assertEquals(6, target.maximalRectangle(
            new char[][] {
                new char[] {'1', '0', '1', '0', '0'},
                new char[] {'1', '0', '1', '1', '1'},
                new char[] {'1', '1', '1', '1', '1'},
                new char[] {'1', '0', '0', '1', '0'}
        }));
        assertEquals(1,  target.maximalRectangle(new char[][] { new char[] {'1'}}));
        assertEquals(0,  target.maximalRectangle(new char[][] { new char[] {'0'}}));
    }
}