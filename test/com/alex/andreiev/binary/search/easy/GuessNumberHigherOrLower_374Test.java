package com.alex.andreiev.binary.search.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLower_374Test {

    @Test
    void guessNumber() {
        var target = new GuessNumberHigherOrLower_374();
        assertEquals(6, target.guessNumber(10, 6));
        assertEquals(1, target.guessNumber(1, 1));
        assertEquals(1, target.guessNumber(2, 1));
        assertEquals(2, target.guessNumber(2, 2));
        assertEquals(1, target.guessNumber(2, 1));
    }
}