package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreFromRemovingSubstrings_1717Test {

    @Test
    void maximumGain() {
        var target = new MaximumScoreFromRemovingSubstrings_1717();
        assertEquals(19, target.maximumGain("cdbcbbaaabab", 4, 5));
        assertEquals(20, target.maximumGain("aabbaaxybbaabb", 5, 4));
    }
}