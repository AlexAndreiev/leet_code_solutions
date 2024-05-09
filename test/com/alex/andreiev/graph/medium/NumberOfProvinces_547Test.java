package com.alex.andreiev.graph.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvinces_547Test {

    @Test
    void findCircleNum() {
        var target = new NumberOfProvinces_547();
        assertEquals(2, target.findCircleNum(new int[][]{
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        }));

        assertEquals(3, target.findCircleNum(new int[][]{
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        }));
    }
}