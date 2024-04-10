package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock_121Test {

    @Test
    void maxProfit() {
        var target = new BestTimeToBuyAndSellStock_121();
//        Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        assertEquals(5, target.maxProfit( new int[] {7,1,5,3,6,4}));

//        In this case, no transactions are done and the max profit = 0.
        assertEquals(0, target.maxProfit( new int[] {7,6,4,3,1}));

        assertEquals(1, target.maxProfit( new int[] {1, 2}));
        assertEquals(2, target.maxProfit( new int[] {2, 4, 1}));

    }
}