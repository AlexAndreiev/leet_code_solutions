package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition_easy_35Test {

    @Test
    void searchInsert() {
        var target = new SearchInsertPosition_easy_35();
        assertEquals(2, target.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, target.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, target.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, target.searchInsert(new int[]{1}, 1));

        assertEquals(3, target.searchInsert(new int[]{2,7,8,9,10}, 9));
        assertEquals(0, target.searchInsert(new int[]{1,3}, 0));
    }
}