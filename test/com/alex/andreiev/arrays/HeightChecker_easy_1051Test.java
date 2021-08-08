package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightChecker_easy_1051Test {

    @Test
    void heightChecker() {
        var target = new HeightChecker_easy_1051();
/*
        Input: heights = [1,1,4,2,1,3]
        Output: 3
        Explanation:
        heights:  [1,1,4,2,1,3]
        expected: [1,1,1,2,3,4]
        Indices 2, 4, and 5 do not match.
*/
        assertEquals(3, target.heightChecker(new int[] {1,1,4,2,1,3}));

/*
        Input: heights = [5,1,2,3,4]
        Output: 5
        Explanation:
        heights:  [5,1,2,3,4]
        expected: [1,2,3,4,5]
        All indices do not match.
*/
        assertEquals(5, target.heightChecker(new int[] {5,1,2,3,4}));

/*
        Input: heights = [1,2,3,4,5]
        Output: 0
        Explanation:
        heights:  [1,2,3,4,5]
        expected: [1,2,3,4,5]
        All indices match.
*/
        assertEquals(0, target.heightChecker(new int[] {1,2,3,4,5}));
    }
}