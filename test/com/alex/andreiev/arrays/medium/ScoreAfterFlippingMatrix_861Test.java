package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreAfterFlippingMatrix_861Test {

    @Test
    void matrixScore() {
        var target = new ScoreAfterFlippingMatrix_861();
        assertEquals(39, target.matrixScore(new int[][]{
            {0,0,1,1},
            {1,0,1,0},
            {1,1,0,0}
        }));

        assertEquals(1, target.matrixScore(new int[][]{
            {0}
        }));
    }
}