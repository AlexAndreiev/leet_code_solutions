package com.alex.andreiev.companies.microsoft.fix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxBinaryOnesSpanTest {

    @Test
    void solution() {
        var target = new MaxBinaryOnesSpan();
        assertEquals(1, target.solution(new int[] {0, 1, 1, 1, 0, 1, 1, 1, 0, 1}));
        assertEquals(-1, target.solution(new int[] {0, 0}));
        assertEquals(0, target.solution(new int[] {1, 1, 1, 0, 0, 1, 1, 1, 0, 1}));
    }
}