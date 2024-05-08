package com.alex.andreiev.arrays.medium;

import com.alex.andreiev.dynamic.programming.medium.DominoAndTrominoTiling_790;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoAndTrominoTiling_790Test {

    @Test
    void numTilings() {
        var target = new DominoAndTrominoTiling_790();
        assertEquals(5, target.numTilings(3));
        assertEquals(1, target.numTilings(1));
    }
}