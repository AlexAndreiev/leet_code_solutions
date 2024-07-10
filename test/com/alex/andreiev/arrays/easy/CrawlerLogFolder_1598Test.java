package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrawlerLogFolder_1598Test {

    @Test
    void minOperations() {
        var target = new CrawlerLogFolder_1598();
        assertEquals(2, target.minOperations(new String[] {"d1/","d2/","../","d21/","./"}));
        assertEquals(3, target.minOperations(new String[] {"d1/","d2/","./","d3/","../","d31/"}));
        assertEquals(0, target.minOperations(new String[] {"d1/","../","../","../"}));
        assertEquals(0, target.minOperations(new String[] {"./","../","./"}));
    }
}