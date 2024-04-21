package com.alex.andreiev.graph.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindIfPathExistsInGraph1971Test {

    @Test
    void validPath() {
        var target = new FindIfPathExistsInGraph_1971();
        assertTrue(target.validPath(3, new int[][]{
            {0, 1},
            {1, 2},
            {2, 0}
        }, 0, 2));

        assertFalse(target.validPath(6, new int[][]{
            {0, 1},
            {0, 2},
            {3, 5},
            {5, 4},
            {4, 3}
        }, 0, 5));
    }
}