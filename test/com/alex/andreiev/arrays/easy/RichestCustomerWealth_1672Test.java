package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealth_1672Test {

    @Test
    void maximumWealth() {
        var target = new RichestCustomerWealth_1672();
        assertEquals(6, target.maximumWealth(new int[][] {
            {1, 2, 3},
            {3, 2, 1}
        }));

        assertEquals(6, target.maximumWealth(new int[][] {
            {1, 2, 3},
            {3, 2, 1}
        }));
    }
}