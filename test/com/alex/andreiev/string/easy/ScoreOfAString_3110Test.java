package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreOfAString_3110Test {

    @Test
    void scoreOfString() {
        var target = new ScoreOfAString_3110();
        assertEquals(13, target.scoreOfString("hello"));
        assertEquals(50, target.scoreOfString("zaz"));
    }
}