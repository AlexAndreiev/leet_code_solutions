package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LuckyNumbersInAMatrix_1380Test {

    @Test
    void luckyNumbers() {
        var target = new LuckyNumbersInAMatrix_1380();
        assertIterableEquals(List.of(15), target.luckyNumbers(new int[][]{
            {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
        }));

        assertIterableEquals(List.of(12), target.luckyNumbers(new int[][]{
            {1,10,4,2},{9,3,8,7},{15,16,17,12}
        }));

        assertIterableEquals(List.of(7), target.luckyNumbers(new int[][]{
            {7, 8}, {1, 2}
        }));
    }
}