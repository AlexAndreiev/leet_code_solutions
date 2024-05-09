package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeHappinessOfSelectedChildren_3075Test {

    @Test
    void maximumHappinessSum() {
        var target = new MaximizeHappinessOfSelectedChildren_3075();
        assertEquals(4, target.maximumHappinessSum(new int[] {1, 2, 3}, 2));
        assertEquals(1, target.maximumHappinessSum(new int[] {1, 1, 1, 1}, 2));
        assertEquals(5, target.maximumHappinessSum(new int[] {2, 3, 4, 5}, 1));
    }
}