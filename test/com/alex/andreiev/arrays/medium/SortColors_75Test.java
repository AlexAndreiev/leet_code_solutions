package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColors_75Test {

    @Test
    void sortColors() {
        var target = new SortColors_75();
        var input = new int[] {2,0,2,1,1,0};
//        target.sortColors(input);
//        assertArrayEquals(new int[] {0,0,1,1,2,2}, input);
//
//        input = new int[] {2, 1, 0};
//        target.sortColors(input);
//        assertArrayEquals(new int[] {0, 1, 2}, input);

        input = new int[] {2, 2, 1};
        target.sortColors(input);
        assertArrayEquals(new int[] {1, 2, 2}, input);
    }
}