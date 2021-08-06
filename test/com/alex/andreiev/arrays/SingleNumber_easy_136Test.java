package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumber_easy_136Test {

    @Test
    void singleNumber() {

        var target = new SingleNumber_easy_136();
        assertEquals(1, target.singleNumber(new int[] {2,2,1}));
        assertEquals(4, target.singleNumber(new int[] {4,1,2,1,2}));
        assertEquals(1, target.singleNumber(new int[] {1}));
    }
}