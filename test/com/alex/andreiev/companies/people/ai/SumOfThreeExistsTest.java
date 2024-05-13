package com.alex.andreiev.companies.people.ai;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfThreeExistsTest {

    @Test
    void isSumExists() {
        var target = new SumOfThreeExists();
        assertTrue(target.isSumExists( new int[] {1, 4, 2, 6, 5, 8, 3}, 9));
        assertFalse(target.isSumExists( new int[] {}, 9));
        assertFalse(target.isSumExists( new int[] {3, 6}, 9));
    }
}